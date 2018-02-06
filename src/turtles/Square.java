package turtles;

public class Square extends Rect {
	
	public Square(double x, double y, double len) {
		xPos = x;
		yPos = y;
		width = len;
		height = len;
	}
	
	public Square () {
		xPos = 50;
		yPos = 50;
		width = 10;
		height = 10;
	}
	
	public String toString() {
		return "Center=(" + xPos + ", " + yPos + "); side length=" + height;
	}

}
