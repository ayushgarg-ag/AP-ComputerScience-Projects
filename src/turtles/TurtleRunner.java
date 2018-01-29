package turtles;

import TurtleGraphics.*;

public class TurtleRunner {
	public static void main(String[] args) {
		Pen p1 = new StandardPen();
		p1.up();
		p1.move(25);
		p1.move(25);
		p1.turn(90);
		p1.down();
		for (int i = 0; i < 4; i++) {
			p1.turn(90);
			p1.move(50);
		}

		Pen p2 = new StandardPen();
		// draw an equilateral triangle using p2
		p2.turn(30);
		for (int i = 0; i < 3; i++) {
			p2.move(50);
			p2.turn(-120);
		}

		Pen p3 = new StandardPen();
		// draw a star using p3
		p3.turn(-18);
		for (int i = 0; i < 5; i++) {
			p3.move(50);
			p3.turn(-144);
		}

		Pen p4 = new WiggleRainbowPen();
		int dist = (int) (10 + Math.random() * 20);
		for (int i = 0; i < 1000; i++) {
			p4.move(dist);
			p4.turn(Math.random()*20);
		}


	}
}
