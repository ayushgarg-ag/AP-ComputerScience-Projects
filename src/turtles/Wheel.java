package turtles;

import TurtleGraphics.*;

public class Wheel extends Circle {
	protected int spokes;

	public Wheel() {
		xPos = 50;
		yPos = 50;
		radius = 10;
		spokes = 8;
	}

	public Wheel(double x, double y, double radius, int numSpokes) {
		super(x, y, radius);
		spokes = numSpokes;
	}

	public int getSpokes() {
		return spokes;
	}

	public void setSpokes(int numSpokes) {
		spokes = numSpokes;
	}

	public void draw(Pen p) {
		super.draw(p);

		p.move(xPos, yPos);
		p.setDirection(90);
		for (int i = 0; i < spokes; i++) {
			p.move(radius);
			p.turn(180);
			p.move(radius);
			p.turn((360 / spokes)+180);

		}
	}

	public String toString() {
		return super.toString() + "; spokes=" + spokes;
	}
}
