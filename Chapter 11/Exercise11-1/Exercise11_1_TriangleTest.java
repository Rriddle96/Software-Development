/*
Name: Robert Riddle
Date: 05/09/2024

This program is designed to test Triangle class and GeometricObject class by prompting the user
to enter 3 sides of a triangle, a color for the triangle, and a boolean value to indicate if
the triangle is filled.
 */

import java.util.Scanner;

public class Exercise11_1_TriangleTest {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter a number for side 1 of the Triangle");
	double side1 = input.nextDouble();
	
	System.out.println("Please enter a number for side 2 of the Triangle");
	double side2 = input.nextDouble();
	
	System.out.println("Please enter a number for side 3 of the Triangle");
	double side3 = input.nextDouble();
	
	System.out.println("Please enter a color for the Triangle");
	String color = input.next();
	
	System.out.println("Is the Triangle filled? (True or False)");
	boolean filled = input.nextBoolean();
	
	input.close();
	
	Triangle triangle = new Triangle( side1, side2, side3);
	triangle.setColor(color);
	triangle.setFilled(filled);
	
	
		System.out.println("The area of the Triangle is: " + triangle.getArea());		
		System.out.println("The perimeter of the Triangle is: " + triangle.getPerimeter());
		System.out.println("The color of the Triangle is: " + triangle.getColor());
		System.out.println("The Triangle is" + (triangle.isFilled() ? " " : " not ") + "filled");
		System.out.println("The Triangle was created on this date: " + triangle.getDateCreated());
	}
	
}