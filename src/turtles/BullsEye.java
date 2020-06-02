package turtles;

import TurtleGraphics.Pen;

public class BullsEye extends Circle {
	private int rings;

	public BullsEye() {
		xPos = 0;
		yPos = 0;
		radius = 5;
		rings = 5;
	}

	public BullsEye(double x, double y, double r, int e) {
		super(x, y, r);
		rings = e;
	}

	public int getRings() {
		return rings;
	}

	public void setRings(int numRings) {
		rings = numRings;
	}

	public void draw(Pen p) {
		for (int i = 0; i < rings; i++) {
			super.draw(p);
			super.stretchBy(1.3); // stretchBy is purposeful because that looks more aesthetically pleasing
									// and accurate
		}

	}

	public String toString() {
		return super.toString() + "; rings=" + rings;
	}
}
