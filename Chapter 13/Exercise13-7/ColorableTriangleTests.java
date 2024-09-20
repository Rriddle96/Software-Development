/*
Name: Robert Riddle
Date: 09/18/2024

 This program creates an array of 5 Triangles using the GeometricObject class and triangle class.
 
 
 */
public class ColorableTriangleTests {
	
	public static void main(String[] args) {
		
		// Creates the 5 objects using the array.
		GeometricObject[] triangles = new GeometricObject[5];
		triangles[0] = new Triangle(3,3,3);
		triangles[1] = new Triangle(1,1,1);
		triangles[2] = new Triangle(2.2,2.2,2.2);
		triangles[3] = new Triangle(3.3,3.3,3.3);
		triangles[4] = new Triangle(9.1,9.1,9.1);
		
		// Loops and prints all 5 arrays
		for(int i = 0; i < triangles.length; i++) {
		
			System.out.println("\nTriangle: " + (i + 0));
			System.out.println("Area: " + triangles[i].getArea());
			System.out.println("How to color a triangle? " + ((Triangle) triangles[i]).howToColor());

		}
		
    }
}