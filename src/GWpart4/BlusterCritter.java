package GWpart4;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class BlusterCritter extends Critter {
	protected static int c;

	public BlusterCritter() {
		super();
		c = 3;
	}

	public BlusterCritter(int courage) {
		super();
		c = courage;
	}

	public ArrayList<Actor> getActors() {
		Location loc = this.getLocation();
		int col = loc.getCol();
		int row = loc.getRow();

		ArrayList<Actor> all = new ArrayList<Actor>();
		ArrayList<Actor> topright = getGrid().getNeighbors(new Location(row - 1, col + 1));
		ArrayList<Actor> topleft = getGrid().getNeighbors(new Location(row - 1, col - 1));
		ArrayList<Actor> bottomright = getGrid().getNeighbors(new Location(row + 1, col + 1));
		ArrayList<Actor> bottomleft = getGrid().getNeighbors(new Location(row + 1, col - 1));

		for (int i = 0; i < topright.size(); i++) {
			if (topright.get(i) != this && !(all.contains(topright.get(i)))) {
				all.add(topright.get(i));
			}
		}
		for (int i = 0; i < topleft.size(); i++) {
			if (topleft.get(i) != this && !(all.contains(topleft.get(i)))) {
				all.add(topleft.get(i));
			}
		}
		for (int i = 0; i < bottomright.size(); i++) {
			if (bottomright.get(i) != this && !(all.contains(bottomright.get(i)))) {
				all.add(bottomright.get(i));
			}
		}
		for (int i = 0; i < bottomleft.size(); i++) {
			if (bottomleft.get(i) != this && !(all.contains(bottomleft.get(i)))) {
				all.add(bottomleft.get(i));
			}
		}
		return all;
	}

	public void processActors(ArrayList<Actor> actors) {
		int count = 0;
		for (Actor a : actors) {
			if (a instanceof Critter) {
				count++;
			}
		}

		if (c > count) {
			Color col = getColor().brighter();
			setColor(col);
		} else {
			Color colo = getColor().darker();
			setColor(colo);
		}
	}
}
