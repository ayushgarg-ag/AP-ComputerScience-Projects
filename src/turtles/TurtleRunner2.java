package turtles;

import java.awt.*;

import TurtleGraphics.*;

public class TurtleRunner2 {

	public static void main(String[] args) {
		StandardPen p1 = new StandardPen();
		drawSquare(90, Color.RED, p1);
	}

	private static void drawSquare(double side, Color col, StandardPen p) {
		p.setColor(col);
		for (int i = 0; i < 4; i++) {
			p.move(side);
			p.turn(90);
		}
		
	}

}
