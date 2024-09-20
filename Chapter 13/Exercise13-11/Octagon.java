public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	
	private double side;
	
	public Octagon() {
		this.side = 1.0;
		
	}
	
	public Octagon(double side) {
		this.side = side;
		
	}
	
	public void setSide(double side) {
		this.side = side;
		
	}
	
	public double getSide() {
		return side;
		
	}
	
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
		
	}
	@Override
	public double getPerimeter() {
		return 8 * side;
		
	}
	// Implements the compareTo method defined in the class
	@Override
	public int compareTo(Octagon o) {
		return Double.compare(this.getArea(), o.getArea());

	}
	// Implements the clone method defined in the class
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
				"\nPerimeter: " + getPerimeter();
		
		}
	
	
	}
