package turtles;

import TurtleGraphics.Pen;

public class Polygon implements Shape {
	private double xPos;
	private double yPos;
	private int sides;
	private double length;

	public Polygon() {
		xPos = 0;
		yPos = 0;
		sides = 6;
		length = 5;
	}

	public Polygon(double x, double y, int s, double l) {
		xPos = x;
		yPos = y;
		sides = s;
		length = l;
	}

	@Override
	public double area() {
		double apothem = (length/2)*(Math.tan((Math.PI*(sides-2))/(2*sides)));
		double radius = length/(2*Math.sin(180/sides));
		return .5 * apothem * sides * length;
	}

	@Override
	public void draw(Pen p) {
		p.up();
		p.move(xPos+length/2, yPos+length/2);
		p.down();
		p.setDirection(180);
		for (int i = 0; i < sides; i++) {
			p.move(length);
			p.turn(((sides-2)*180)/sides);
		}
	}

	@Override
	public double getXPos() {
		return xPos;
	}

	@Override
	public double getYPos() {
		return yPos;
	}

	@Override
	public void move(double x, double y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public void stretchBy(double factor) {
		// TODO Auto-generated method stub
//		apothem *= factor;
		sides *= factor;
	}

	public String toString() {
		return "Center=(" + xPos + ", " + yPos + "); Sides=" + sides + ";";
	}

}



