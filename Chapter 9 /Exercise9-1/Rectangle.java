
	class Rectangle {
		
		double width = 1;
		double height = 1;
		
		Rectangle() {
			
		}
		
		Rectangle( double newWidth, double newHeight) {
			width = newWidth;
			height = newHeight;
		}
		
		double getArea() {
			return height * width;
		}
		
		double getPerimeter() {
			return 2 * (height + width);
		}
}
