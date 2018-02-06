package turtles;

import TurtleGraphics.Pen;

public class Rect implements Shape {
	protected double xPos;
	protected double yPos;
	protected double height;
	protected double width;

	public Rect() {
		xPos = 0;
		yPos = 0;
		height = 1.0;
		width = 1.0;
	}

	public Rect(double x, double y, double h, double w) {
		xPos = x;
		yPos = y;
		height = h;
		width = w;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public void draw(Pen p) {
		p.up();
		p.move(xPos+width/2, yPos+height/2);
		p.down();
		p.setDirection(180);
		for (int i = 0; i < 2; i++) {
			p.move(width);
			p.turn(90);
			p.move(height);
			p.turn(90);
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
		height *= factor;
		width *= factor;
	}

	public String toString() {
		return "Center=(" + xPos + ", " + yPos + "); height=" + height + "; width=" + width;
	}
}