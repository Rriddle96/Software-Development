/*
Name: Robert Riddle
Date: 09/20/2024

This program creates an object and clones itself before using the compareTo method
to check if the cloned copy has the same values as the original.


 */

import java.util.Random;
public class OctagonTest { 
	public static void main(String[] args) throws CloneNotSupportedException {
		Random random = new Random();
		// Creates the original object using random values.
		Octagon object1 = new Octagon(random.nextInt(8) + 1);
		
		System.out.println("Octagon area: " + object1.getArea()
		+ "\nOctagon perimeter: " + object1.getPerimeter());
		
		// Creates the clone using the same values as the original.
		System.out.println("\nCloning new Octagon...");
		Octagon object2 = (Octagon)object1.clone();
		
		System.out.println("\nOctagon area: " + object2.getArea()
		+ "\nOctagon perimeter: " + object2.getPerimeter());
		

		// Compares the original to the clone to check if they are the same.
	     System.out.println("\nDo the octagons have the same value: " + (object1.compareTo(object2) == 0));
	    // Checks the two objects for reference equality.
	     System.out.println("Do they refer to the same object? " + (object1 == object2));

	    }
	}