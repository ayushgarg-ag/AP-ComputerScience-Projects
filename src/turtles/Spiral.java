package turtles;

import TurtleGraphics.Pen;

public class Spiral implements Shape {
	private double xPos;
	private double yPos;
	private double radius;
	
	public Spiral () {
		xPos = 0;
		yPos = 0;
		radius = 5;
	}
	public Spiral (double x, double y, double r) {
		xPos = x;
		yPos = y;
		radius = r;
		
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius *radius;
	}

	@Override
	public void draw(Pen p) {
		// TODO Auto-generated method stub
		p.up();
		p.move(xPos, yPos+radius);		
		p.down();
		p.setDirection(180);
		for (int i = 0; i < 360; i++) {
			p.move((2*Math.PI*radius)/360);
			radius = 2;
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
		radius *= factor;
	}
	
	public String toString() {
		return "Center=(" + xPos + ", " + yPos + "); radius=" + radius;
	}

}
