package turtles;

import java.util.Scanner;

import TurtleGraphics.Pen;
import TurtleGraphics.RainbowPen;
import TurtleGraphics.StandardPen;
import TurtleGraphics.WigglePen;
import TurtleGraphics.WiggleRainbowPen;

public class KochCurveRunner {

	public static void main(String[] args) {

		String response;
		Pen p;
		Pen p2;
		Scanner reader = new Scanner(System.in);

		System.out.println("Which pen do you want?(1 = StandardPen, 2 = WigglePen, 3 = RainbowPen, 4 = RainbowWigglePen)");
		int pen;
		try {
			pen = reader.nextInt();
		} catch (Exception e) {
			pen = 1;
		}
		if (pen == 1) {
			p = new StandardPen(); // Create a separate Pen window
			p2 = new StandardPen(); // Create a separate Pen window
		} else if (pen == 2) {
			p = new WigglePen(); // Create a separate Pen window
			p2 = new WigglePen(); // Create a separate Pen window
		} else if (pen == 3) {
			p = new RainbowPen(); // Create a separate Pen window
			p2 = new RainbowPen(); // Create a separate Pen window
		} else {
			p = new WiggleRainbowPen(); // Create a separate Pen window
			p2 = new WiggleRainbowPen(); // Create a separate Pen window
		}
		double length;
		int degree;
		System.out.println("What length?");
		length = reader.nextDouble();
		System.out.println("What degree?");
		degree = reader.nextInt();

		p.up();
		p.move(-length/2, length/(2*Math.tan((Math.PI/3))));
//		p.move(0, 0);
		

//		p.setDirection(180);
//		p.move(length / 2);
//		p.setDirection(90);
//		p.move(length * (1/(4*Math.sqrt(3))));
		p.setDirection(0);
		p.down();
		for (int i = 0; i < 3; i++) {
			drawKochCurve(p, length, degree);
			p.turn(-120);
		}

		p.up();
//		p.move(-length/2, length/(2*Math.tan((Math.PI/3))));
		p2.move(length/3, -length/2);

//		p.setDirection(0);
//		p2.move(-length/2,  length/Math.sqrt(2));
//		p2.move(length/3, -length/2);

//		p2.move(0, 0);

//		p.setDirection(180);
//		p2.move(length / 2);
//		p2.setDirection(90);
//		p2.move(length * Math.sqrt(3) / 2);
//		p2.setDirection(180);
		p2.down();
		drawCCurve(p2, length, degree);
	}

	public static void drawKochCurve(Pen p, double len, int deg) {
		if (deg == 0) {
			p.move(len);
		} else {
			drawKochCurve(p, len / 3, deg - 1);
			p.turn(60);
			drawKochCurve(p, len / 3, deg - 1);
			p.turn(-120);
			drawKochCurve(p, len / 3, deg - 1);
			p.turn(60);
			drawKochCurve(p, len / 3, deg - 1);
		}
	}

	public static void drawCCurve(Pen p, double len, int deg) {
		if (deg == 0) {
			p.move(len);
		} else {
			p.turn(45);
			drawCCurve(p, len * Math.sqrt(3) / 2, deg - 1);
			p.turn(-90);
			drawCCurve(p, len * Math.sqrt(3) / 2, deg - 1);
			p.turn(45);
		}
	}
}
