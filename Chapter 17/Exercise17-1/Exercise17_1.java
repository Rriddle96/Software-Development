/*
Name: Robert Riddle
Date: 09/10/2024

This program creates a named file "Exercise17_01.txt" if it does not exists, but if it does 
it will append new data to the file seperated by a space 

 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Exercise17_1 {
	// Exception declared in method
	public static void main(String args[] ) throws IOException {
		Random random = new Random();
		// creates named file 
		File file = new File("Exercise17_01.txt");
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) { // checks for if the file exists, but if it does, appends new data to file
			if (!file.exists()) { // checks to see if file exists
				file.createNewFile();
			}
			
		
		for (int i = 0; i < 100; i++) { //Generates 100 integers using java.util.Random
			int randomInt = random.nextInt(100);
			writer.print(randomInt + " ");
		}
		
		System.out.println("100 random integers written to " + "Exercise17_01.txt");
	}

	}
}

