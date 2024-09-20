public class Triangle extends GeometricObject implements Colorable {
	
	private double side1;
	private double side2;
	private double side3;
	
	
	public Triangle() {
	}
	
	public Triangle (double side1, double side2, double side3) {
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
	
	}
	
	public Triangle (double side1, double side2, double side3, String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1() {
		return side1;
		
	}
	
	public void setSide1() {
		this.side1 = side1;
		
	}
	
	public double getSide2() {
		return side2;
		
	}
	public void setSide2() {
		this.side2 = side2;
		
	}
	public double getSide3() {
		return side3;
		
	}
	public void setSide3() {
		this.side3 = side3;
		
	}
	// Overrides the abstract getArea method in the GeometricObject abstract class.
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	// Overrides the abstract getPerimeter method in the GeometricObject abstract class.
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
		
		
	}
	// Overrides the abstract howToColor method in the interface class.
	@Override
	public String howToColor() {
		return "Color all three sides";
	}
	
	// Overrides the abstract toString method in the GeometricObject abstract class.
	@Override
	public String toString() {
		return "Triangle sides\nSide1: " + side1 + " Side2: " + side2 + " Side3: " + side3
				+ super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
		
	}

}