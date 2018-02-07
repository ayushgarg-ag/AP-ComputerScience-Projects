package turtles;

import TurtleGraphics.*;

public class PolyRunner {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rect(-10.0, 10.0, 20.0, 20.0);
		shapes[1] = new Circle(10.0, 10.0, 10.0);
		shapes[2] = new Wheel(10.0, -10.0, 10.0, 6);
		Pen p = new StandardPen();
		for (Shape s : shapes) {
			s.draw(p);
			System.out.println(s + " area: " + s.area());
		}

	}

}
