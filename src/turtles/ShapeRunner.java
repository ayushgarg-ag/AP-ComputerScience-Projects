package turtles;

import java.util.Scanner;

import TurtleGraphics.*;

public class ShapeRunner {
	public static void main(String[] argv) {
		Pen p1 = new StandardPen(); // create a Pen to use to draw multiple Rects
		Rect r1 = new Rect(0.0, 0.0, 10.0, 20.0); // create a new Rect
		r1.draw(p1); // draw initial rectangle to the Pen
		r1.stretchBy(10.0); // scale it to be 10x larger
		r1.draw(p1); // draw it again (now shows 2 rectangles)
		r1.move(100.0, 100.0); // move it to a new centerpoint
		r1.draw(p1); // draw it a third time
		p1.up(); // lift Pen
		p1.move(-100, -100); // move Pen to below the rectangles
		p1.drawString("" + r1); // invoke Rect's toString - display it
		p1.move(-100, -115); // move down
		p1.drawString("" + r1.area()); // display the Rect's area

		Pen p2 = new StandardPen(); // Create a separate Pen window
		Circle c1 = new Circle(0.0, 0.0, 10.0); // Create a Circle instance
		c1.draw(p2); // Draw the Circle with p2
		c1.stretchBy(10.0);
		c1.draw(p2);
		c1.move(100.0, 100.0);
		c1.draw(p2);
		p2.up();
		p2.move(-100, -100);
		p2.drawString("" + c1);
		p2.move(-100, -115);
		p2.drawString("" + c1.area());

		Pen p3 = new StandardPen(); // Create a separate Pen window
		Polygon e1 = new Polygon(0.0, 0.0, 6, 10); // Create a Polygon instance
		e1.draw(p3); // Draw the Polygon with p3
		e1.stretchBy(10.0);
		e1.draw(p3);
		e1.move(100.0, 100.0);
		e1.draw(p3);
		p3.up();
		p3.move(-100, -200);
		p3.drawString("" + e1);
		p3.move(-100, -215);
		p3.drawString("" + e1.area());

		Pen p4;
		int val;
		double param1;
		double param2;
		double param3;
		double param4;
		int param5;

		String response;
		Scanner reader2 = new Scanner(System.in);
		do {
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

			System.out.println("Which shape do you want?(1=Rect, 2=Circle, 3=Polygon)");
			try {
				val = reader.nextInt();
			} catch (Exception e) {
				val = 1;
			}
			double p;
			int pp;
			if (val == 1) {
				System.out.println("Enter an X position");
				p = reader.nextDouble();
				param1 = p;
				System.out.println("Enter a Y position");
				p = reader.nextDouble();
				param2 = p;
				System.out.println("Enter a height");
				p = reader.nextDouble();
				param3 = p;
				System.out.println("Enter a width");
				p = reader.nextDouble();
				param4 = p;
				Rect s = new Rect(param1, param2, param3, param4); // create a new Rect
				s.draw(p4); // Draw the Polygon with p3
				s.stretchBy(10.0);
				s.draw(p4);
				s.move(100.0, 100.0);
				s.draw(p4);
				p4.up();
				p4.move(-100, -200);
				p4.drawString("" + s);
				p4.move(-100, -215);
				p4.drawString("" + s.area());
			} else if (val == 2) {
				System.out.println("Enter an X position");
				val = reader.nextInt();
				param1 = val;
				System.out.println("Enter a Y position");
				val = reader.nextInt();
				param2 = val;
				System.out.println("Enter a radius");
				val = reader.nextInt();
				param3 = val;

				Circle s = new Circle(param1, param2, param3); // Create a Circle instance
				s.draw(p4); // Draw the Polygon with p3
				s.stretchBy(10.0);
				s.draw(p4);
				s.move(100.0, 100.0);
				s.draw(p4);
				p4.up();
				p4.move(-100, -200);
				p4.drawString("" + s);
				p4.move(-100, -215);
				p4.drawString("" + s.area());
			} else {
				System.out.println("Enter an X position");
				p = reader.nextDouble();
				param1 = p;
				System.out.println("Enter a Y position");
				p = reader.nextDouble();
				param2 = p;
				System.out.println("Enter the number of sides in the polygon");
				pp = reader.nextInt();
				param5 = pp;
				System.out.println("Enter the side length");
				p = reader.nextDouble();
				param4 = p;
				Polygon s = new Polygon(param1, param2, param5, param4); // Create a Polygon instance
				s.draw(p4); // Draw the Polygon with p3
				s.stretchBy(10.0);
				s.draw(p4);
				s.move(100.0, 100.0);
				s.draw(p4);
				p4.up();
				p4.move(-100, -200);
				p4.drawString("" + s);
				p4.move(-100, -215);
				p4.drawString("" + s.area());
			}

			System.out.println("Do you want to play again? (yes or no)");
			response = reader2.next();

		} while (response.equals("yes"));
	}
}
