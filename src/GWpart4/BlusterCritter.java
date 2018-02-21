package GWpart4;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;
import info.gridworld.gui.*;

public class BlusterCritter extends Critter {
	protected static int c;

	public BlusterCritter() {
		super();
		c = 3;
	}
	public BlusterCritter (int courage) {
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
			all.add(topright.get(i));
		}
		for (int i = 0; i < topleft.size(); i++) {
			all.add(topleft.get(i));
		}
		for (int i = 0; i < bottomright.size(); i++) {
			all.add(bottomright.get(i));
		}
		for (int i = 0; i < bottomleft.size(); i++) {
			all.add(bottomleft.get(i));
		}
		for (Actor a: all) {
			System.out.println(a);
			
		}
		return all;
		// getGrid().getNeighbors(loc);
		// for (int r = -2; r < 2; r++) {
		// Location l =
		// }
		//
		//
		// ArrayList<Actor> all;
		// ArrayList<Actor> each;
		// ArrayList<Actor> crit= getGrid().getNeighbors(getLocation());
		// for (int i = 0; i < crit.size(); i++) {
		// Location loc = crit.get(i).getLocation();
		// each.add((getGrid().getNeighbors(loc)));
		// for (int n = 0; n < each.size(); n++) {
		//
		// }
		// }

	}

	public void processActors(ArrayList<Actor> actors) {
		int count = 0;
		for (Actor a : actors) {
			if (a instanceof Critter) {
				count++;
			}
		}
		System.out.println("C value: " + c);
		System.out.println("Number of critters: " + c);

		if (c > count) {
			Color col = getColor().brighter();
			System.out.println(col);
			setColor(col);
		}
		else {
			Color colo = getColor().darker();
			setColor(colo);
		}
	}
}
