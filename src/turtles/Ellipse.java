package turtles;

import TurtleGraphics.Pen;

public class Ellipse implements Shape {
	private double xPos;
	private double yPos;
	private double radOne;
	private double radTwo;
	
	public Ellipse () {
		xPos = 0;
		yPos = 0;
		radOne = 5.0;
		radTwo = 10.0;
	}
	public Ellipse (double x, double y, double r1, double r2) {
		xPos = x;
		yPos = y;
		radOne = r1;
		radTwo = r2;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radOne * radTwo;
	}

	@Override
	public void draw(Pen p) {
		// TODO Auto-generated method stub
		p.up();
		p.move(xPos + radOne, yPos + radTwo);		
		p.down();
		p.setDirection(180);
		for (int i = 0; i < 360; i++) {
			double circumference = 2*Math.PI*Math.sqrt(((Math.pow(radOne, 2))+(Math.pow(radTwo, 2)))/2);
			p.move((circumference)/360);
			p.turn(1);
		}
	}

	@Override
	public double getXPos() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public double getYPos() {
		// TODO Auto-generated method stub
		return yPos;
	}

	@Override
	public void move(double xPos, double yPos) {
		// TODO Auto-generated method stub
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public void stretchBy(double factor) {
		// TODO Auto-generated method stub
		radOne *= factor;
		radTwo *= factor;
	}
	
	public String toString() {
		return "Center=(" + xPos + ", " + yPos + "); Radius One =" + radOne + "; Radius Two =" + radTwo;
	}

}
