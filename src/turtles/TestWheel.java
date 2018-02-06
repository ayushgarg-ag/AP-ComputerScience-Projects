package turtles;

import TurtleGraphics.*;

public class TestWheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Pen p1 = new StandardPen ();
	 	Wheel w1 = new Wheel (0.0, 0.0, 10., 8); 
	 	w1.draw (p1);
	 	w1.stretchBy (10.0);
	 	w1.draw (p1);
	 	w1.move (100.0, 100.0);
	 	w1.draw (p1);
	 	System.out.println (w1);
	 	System.out.println (w1.area());
	 	
	 	Pen p2 = new StandardPen ();	 	
	 	Square s1 = new Square (0.0, 0.0, 20.0); 
	 	 s1.draw (p2);
	 	 s1.stretchBy (10.0);
	 	 s1.draw (p2);
	 	 s1.move (100.0, 100.0);
	 	 s1.draw (p2);
	 	 System.out.println (s1);
	 	 System.out.println (s1.area());

	}

}
