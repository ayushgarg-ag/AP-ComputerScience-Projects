package turtles;

import java.awt.*;

import TurtleGraphics.*;

public class TurtleRunner2 {

	public static void main(String[] args) {
		StandardPen p1 = new StandardPen();
		drawSquare(90, Color.RED, p1);
		drawSquare (90, Color.RED, new RainbowPen());		   
		drawSquare (90, Color.RED, new WigglePen());		   
		drawSquare (90, Color.RED, new WiggleRainbowPen());

	}

	private static void drawSquare(double side, Color col, Pen p) {
		p.setColor(col);
		p.up();
		p.move(side/2, side/2);
		p.down();
		p.setDirection(180);
		for (int i = 0; i < 4; i++) {
			p.move(side);
			p.turn(90);
		}
		
	}

}
