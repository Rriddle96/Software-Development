/* 
Name: Robert Riddle
Date: 09/11/2024

This Program is designed to create an array with 100 randomly chosen integers by getting user input.
This program will also have try-catch block that will check and handle any ArrayIndexOutOfBoundsException 
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise12_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Generates the random array 
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) + 1;
		}
			// Prompts the user for input as well as letting user know what integers are allowed to be entered.
			System.out.println("Enter a index for the array");
			System.out.println("Input must be from 0 to 99");

			
			// Checks the users input for any integer input that would cause an out of bounds error.
			try {
				int index = input.nextInt();
			//	The error is triggered when the program prints out the element value.
				System.out.println("array[" + index + "] has an element value of " + array[index]);
			}
			/* This exception handles the out of bounds error when the input is below 0 or above 99 and
			   stops the program from crashing out. */
			catch (IndexOutOfBoundsException ex) {
				System.out.println("INDEX " + ex.getLocalizedMessage() + " is out of bounds");
			}
		
	}
}