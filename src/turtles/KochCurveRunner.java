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
		Pen p4;
		Scanner reader = new Scanner(System.in);

		System.out.println("Which pen do you want?(1=StandardPen, 2=WigglePen, 3=RainbowPen, 4=RainbowWigglePen)");
		int pen;
		try {
			pen = reader.nextInt();
		} catch (Exception e) {
			pen = 1;
		}
		if (pen == 1) {
			p4 = new StandardPen(); // Create a separate Pen window
		} else if (pen == 2) {
			p4 = new WigglePen(); // Create a separate Pen window
		} else if (pen == 3) {
			p4 = new RainbowPen(); // Create a separate Pen window
		} else {
			p4 = new WiggleRainbowPen(); // Create a separate Pen window
		}		
		double length;
		int degree;
		System.out.println("What length?");
		length = reader.nextDouble();
		System.out.println("What degree?");
		degree = reader.nextInt();
		p4.setDirection(0);

		for (int i = 0; i < 6; i++) {
			drawKochCurve(p4, length, degree);
			p4.turn(-60);
//			drawKochCurve(p4, length, degree);
//			p4.turn(-60);
//			drawKochCurve(p4, length, degree);
		}
	}
	public static void drawKochCurve(Pen p, double len, int deg) {
		if (deg == 0) {
//			p.down();
//			p.setDirection(0);
			p.move(len);
		}
		else {
			drawKochCurve(p, len/3, deg - 1);
			p.turn(60);
			drawKochCurve(p, len/3, deg - 1);
			p.turn(-120);
			drawKochCurve(p, len/3, deg - 1);
			p.turn(60);
			drawKochCurve(p, len/3, deg - 1);
			
//			p.setDirection(0);
//			p.move(len/3.0);
//			p.turn(60);
//			p.move(len/3.0);
//			p.turn(-120);
//			p.move(len/3.0);
//			p.turn(60);
//			p.move(len/3.0);
//			drawKochCurve(p, len, deg - 1);

		}
	}

}
