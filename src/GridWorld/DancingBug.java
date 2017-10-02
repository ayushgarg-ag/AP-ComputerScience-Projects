package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class DancingBug extends Bug {
	// private int steps;
	// private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug() {
		setColor(Color.BLUE);
		// steps = 0;
		// sideLength = (int) (Math.random() * 4) + 1;
	}

	public void turnLeft() {
		setDirection(getDirection() + Location.HALF_LEFT);
	}

	public void act() {
		int turn = (int) (Math.random() * 5) - 2;
		int step = (int) (Math.random() * 6);

		for (int y = 0; y < step; y++) {
			if (turn > 0) {
				for (int x = 0; x < turn; x++) {
					turn();
				}
			} else if (turn < 0) {
				for (int x = 0; x > turn; x--) {
					turnLeft();
				}
			}
		}
		super.act();

	}
}
	// if (turn > 0) {
	// for (int x = 0; turn > x; x++) {
	// turn();
	//// super.act();
	// if (canMove()) {
	// for (int y = 0; step > y; y++) {
	// move();
	// }
	// }
	// else {
	// turn();
	// }
	// }
	// }
	// else if (turn < 0) {
	// for (int x = 0; turn < x; x--) {
	// turnLeft();
	//// super.act();
	// if (canMove()) {
	// for (int y = 0; step > y; y++) {
	// move();
	// }
	// }
	// else {
	// turn();
	// }
	//
	// }
	// }


// public class DancingBug extends Bug {
// public void turnLeft() {
// setDirection(getDirection() + Location.HALF_LEFT);
// }
//
// public void act()
// {
// if (canMove()) {
// int times=(int)(Math.random()*2)-2;
// int steps=(int)(Math.random()*5);
// for (int y=0; y<steps; y++) {
// if (times>0) {
// for (int x=0; x<times; x++){
// turn();
// }
// }
// if (times<0){
// for (int x=0; x>times; x--){
// turnLeft();
// }
// }
// }
// super.act();
// }
// else {
// turn();
// }
// }
// }
