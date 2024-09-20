/*
Name: Robert Riddle
Date: 09/17/2024

This superclass is an abstract class since it contains 2 abstract methods that are overridden in the 
triangle subclass.
 */

public abstract class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
		
	}
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
		
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	public boolean isFilled() {
		return filled;
		
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
		
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
		
	}
	@Override
	public String toString() {
		return "\ncreated on" + dateCreated + "\ncolor:" + color +  "\nfilled:" + filled;
		
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

}
