/*
Name: Robert Riddle
Date: 08/27/2024

This program is an example of how to define classes as well as use classes to create objects.
*/
public class Exercise_9_1 {
	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of Rectangle 1 is " + rec1.width);
		System.out.println("The height of Rectangle 1 is " + rec1.height);
		System.out.println("The area of Rectangle 1 is " + rec1.getArea());
		System.out.println("The perimeter of Rectangle 1 is " + rec1.getPerimeter());
		
		System.out.println("\n----------------------------------\n");
		
		System.out.println("The width of Rectangle 2 is " + rec2.width);
		System.out.println("The height of Rectangle 2 is " + rec2.height);
		System.out.println("The area of Rectangle 2 is " + rec2.getArea());
		System.out.println("The perimeter of Rectangle 2 is " + rec2.getPerimeter());
		
	}

}
