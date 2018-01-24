package flock;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class Bird extends Actor {
	public static boolean flock = true;

	public Bird() {
		this.setColor(Color.GREEN);
	}

	public static boolean getFlock() {
		return Bird.flock;
	}

	public static void setFlock(boolean flock) {
		Bird.flock = flock;
	}

	public void act() {
		if (Bird.flock == true) {
			this.setColor(Color.GREEN);
			ArrayList<Location> empty = this.getGrid().getEmptyAdjacentLocations(this.getLocation());
			if (empty.size() != 0) {
				int rand = (int) (Math.random() * empty.size());
				Location loc = empty.get(rand);
				if (loc.getRow() + 1 == this.getLocation().getRow()) {
					setDirection(this.getLocation().getDirectionToward(loc));
					moveTo(loc);
				}
			}

		} else {
			this.setColor(Color.RED);
			Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
			if (this.getGrid().isValid(south)) {
				if (this.getGrid().get(south) == null) {
					moveTo(south);
				} else {
					Location east = this.getLocation().getAdjacentLocation(Location.EAST);
					if (this.getGrid().isValid(east)) {
						if (this.getGrid().get(east) == null) {
							moveTo(east);
						}
					}
				}
			}
		}
	}
}