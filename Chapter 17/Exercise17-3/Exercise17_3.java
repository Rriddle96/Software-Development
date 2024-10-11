/*
Name: Robert Riddle
Date: 09/10/2024

This program is a modified version of Exercise 17_1  it will create a file "Exercise17_03.dat" if it does not exist
it will create that file, if does exist it will append data to the file. The modification changes the the type of file
 created, instead of a text file it creates a data file using java.io.FileOutputStream and it finds the sum of all numbers 
 by reading the file using java.io.FileInputStream

 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class Exercise17_3 {
	// Exception declared in method
	public static void main(String args[] ) throws IOException {
		Random random = new Random();
		// creates named file 
		File file = new File("Exercise17_03.dat");
		// lets application write primitive Java data types to output stream
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true))) { // checks for if the file exists, but if it does, appends new data to file
			if (!file.exists()) { // checks to see if file exists
				file.createNewFile();
			}
			
		for (int i = 0; i < 100; i++) { //Generates 100 integers using java.util.Random
			int randomInt = random.nextInt(1000);
			output.writeInt((int)(randomInt));
		}
	}
		// lets application read primitive Java data types from an output stream
	try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
        int sum = 0;
        int count = input.available() / 4;
        System.out.println(count);
        while (count > 0) {
            sum += input.readInt();
            count--;
        }
        
        System.out.println("The sum is " + sum);
		}
	}
}

