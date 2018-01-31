package turtles;

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
		
		
		
		Pen p2 = new StandardPen ();		// Create a separate Pen window
		Circle c1 = new Circle (0.0, 0.0, 10.0); 			// Create a Circle instance
		c1.draw (p2);					// Draw the Circle with p2
		c1.stretchBy (10.0);
		c1.draw (p2);
		c1.move (100.0, 100.0);
		c1.draw (p2);
		p2.up();
		p2.move(-100, -100);
		p2.drawString(""+c1);
		p2.move(-100, -115);
		p2.drawString(""+c1.area());
		
		
//		Pen p3 = new StandardPen ();		// Create a separate Pen window
//		Ellipse e1 = new Ellipse(0.0, 0.0, 5.0, 10.0); 			// Create a Circle instance
//		e1.draw (p3);					// Draw the Circle with p2
//		e1.stretchBy (10.0);
//		e1.draw (p3);
//		e1.move (100.0, 100.0);
//		e1.draw (p3);
//		p3.up();
//		p3.move(-100, -100);
//		p3.drawString(""+e1);
//		p3.move(-100, -115);
//		p3.drawString(""+e1.area());
		
//		Pen p3 = new StandardPen ();		// Create a separate Pen window
//		Spiral e1 = new Spiral(0.0, 0.0, 10.0); 			// Create a Circle instance
//		e1.draw (p3);					// Draw the Circle with p2
//		e1.stretchBy (10.0);
//		e1.draw (p3);
//		e1.move (100.0, 100.0);
//		e1.draw (p3);
//		p3.up();
//		p3.move(-100, -100);
//		p3.drawString(""+e1);
//		p3.move(-100, -115);
//		p3.drawString(""+e1.area());
		
		
		Pen p3 = new StandardPen ();		// Create a separate Pen window
		Polygon e1 = new Polygon(0.0, 0.0, 6, 10.0); 			// Create a Circle instance
		e1.draw (p3);					// Draw the Circle with p2
		e1.stretchBy (10.0);
		e1.draw (p3);
		e1.move (100.0, 100.0);
		e1.draw (p3);
		p3.up();
		p3.move(-100, -100);
		p3.drawString(""+e1);
		p3.move(-100, -115);
		p3.drawString(""+e1.area());
	}
}
