package turtles;

import TurtleGraphics.*;

public class Part2Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new StandardPen();
		Wheel w1 = new Wheel(300.0, -200.0, 10., 5);
		w1.draw(p1);
		w1.stretchBy(10.0);
		w1.draw(p1);
		w1.move(500.0, -300.0);
		w1.draw(p1);
		p1.up();
		p1.move(400, -150);
		p1.drawString("" + w1);
		p1.move(400, -170);
		p1.drawString("" + w1.area());

		Square s1 = new Square(400.0, 200.0, 20.0);
		s1.draw(p1);
		s1.stretchBy(10.0);
		s1.draw(p1);
		s1.move(500.0, 300.0);
		s1.draw(p1);
		p1.up();
		p1.move(400, 80);
		p1.drawString("" + s1);
		p1.move(400, 60);
		p1.drawString("" + s1.area());

		BullsEye b1 = new BullsEye(-550.0, -250.0, 10.0, 4);
		b1.draw(p1);
		b1.stretchBy(2.0);
		b1.draw(p1);
		b1.move(-200.0, 100.0);
		b1.draw(p1);
		p1.up();
		p1.move(-400, -300);
		p1.drawString("" + b1);
		p1.move(-400, -315);
		p1.drawString("" + b1.area());
		
	}

}
