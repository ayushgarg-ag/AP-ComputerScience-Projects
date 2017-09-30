package GridWorld;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug() {
		steps = 0;
		sideLength = (int) (Math.random() * 4) + 1;
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			int turn = (int) (Math.random() * 3) - 1;
			if (turn > 0) {
				turn();
				sideLength = (int) (Math.random() * 4) + 1;
				steps = 0;

			} else {
				turn();
				turn();
				turn();
				turn();
				turn();
				turn();
				turn();
				sideLength = (int) (Math.random() * 5) + 1;
				steps = 0;

			}
		}
	}
}
