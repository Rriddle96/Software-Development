/*
Name: Robert Riddle
Date: 09/17/2024

This program tests the abstract GeometricObject and a Triangle object.
The program asks the user for input on 3 sides of a triangle, the color, and if it's filled.
The Program displays all 3 input sides, the color, if the triangle is filled, the area,
the date created, and the perimeter.
 */
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sides for the triangle:");
        System.out.print("Side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Side 3: ");
        double side3 = input.nextDouble();

        System.out.println("Enter color for the triangle:");
        String color = input.next();

        System.out.println("Is the triangle filled? (true/false):");
        boolean filled = input.nextBoolean();
        	
        

        // Creates Triangle object with user inputs
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        // Displays the Triangle object
        System.out.println(triangle);
    }
}