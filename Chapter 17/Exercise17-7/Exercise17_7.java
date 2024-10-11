/*
Name: Robert Riddle
Date: 10/10/2024

This program is a modified version of Exercise17_07. Creates a file named Exercise17_7.dat
containing Loan objects from the modified Loan class. A void function named output Data was added 
that handles  ObjectOutputStream and ObjectInputStream to read the total loan amount.
 */
import java.io.*;

class Exercise17_7 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Calls outputData to read from the file and display total loan amounts
        outputData();
    }

    public static void outputData() throws IOException, ClassNotFoundException {
    	
        // Serializes Loan objects
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"))) {
            Loan loan1 = new Loan(); // Assumes there's a default constructor
            Loan loan2 = new Loan(1.8, 10, 10000); // Assumes this constructor exists
            output.writeObject(loan1);
            output.writeObject(loan2);
        }
        // Deserializes Loan objects
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"))) {
            while (true) {
                Loan loan = (Loan) input.readObject();
                System.out.printf("Total loan Amount: $%.2f\n", loan.getTotalPayment()); // Prints total loan payment
            }
        } catch (EOFException e) {
            // Ends the loop
        }
    }
}




