package turtles;

import TurtleGraphics.Pen;

abstract public class AbstractShape implements Shape {
	protected double xPos;
	protected double yPos;
	
	final public double getXPos() {
		return xPos;
	}

	final public double getYPos() {
		// TODO Auto-generated method stub
		return yPos;
	}

	final public void move(double xPos, double yPos) {
		// TODO Auto-generated method stub
		this.xPos = xPos;
		this.yPos = yPos;
	}

	abstract public double area();
	
	abstract public void draw(Pen p);

	abstract public void stretchBy(double factor);

	
}
