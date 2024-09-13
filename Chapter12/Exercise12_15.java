/*
Name: Robert Riddle
Date: 09/13/2024

This Program Checks for a specifically named file to see if it exists, if the file does not it will
create a file with 100 integers ranging from 0 - 999.

Questions for Exercise 12 - 15 implementation:
To write to the file you need to use the java.io.PrintWriter package that will write data to the file.
To read the file file you need to use the java.util.Scanner package to read the text data from the file.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise12_15 {
	 public static void main(String[] args) {
	        Random random = new Random();
	        File fileName = new File("Exercise12_15.txt");

	        
	        // Will check to see if file exists, if so the program will notify the user before exiting.
	        if (fileName.exists()) {
	            System.out.println("The file already exists");
	            System.exit(1);
	        }

	        // If the file does not exist this part of the program creates a file with 100 integers.
	        try (PrintWriter out = new PrintWriter(fileName)) {
	            for (int i = 0; i < 100; i++) {
	                out.print(random.nextInt(999)); // Creates the random integers.
	                if (i < 99) out.print("\n"); // Puts every number on its own line in file.
	            }
	            System.out.println("Wrote to file...");
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        }

	        // Reads integers from the file
	        ArrayList<Integer> list = new ArrayList<>();
	        try (Scanner input = new Scanner(fileName)) {
	            while (input.hasNextInt()) { // Checks if the next token is an integer.
	                list.add(input.nextInt());
	            }
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        }

	        // Print the list to the console to verify that what is in the file is correct.
	        System.out.println("Numbers read from file: " + list);
	    }
	}
