package GWpart4;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BlusterCritterRunner {

	public static void main(String[] args) {

		Grid<Actor> grid = new BoundedGrid<Actor>(20, 20);
		ActorWorld world = new ActorWorld (grid);
		
		BlusterCritter crit = new BlusterCritter();
		crit.setColor(Color.GREEN);
		world.add(new Location(5, 5), crit);
		
		
		for (int r = -2; r <= 2; r++) {
			for (int c = -2; c <= 2; c++) {
//				Actor cr = new Critter();
				if (r != 0 && c != 0) {
					world.add(new Location(5-r, 5-c), new Critter());
				}
			}
		}
		
		BlusterCritter critB = new BlusterCritter();
		critB.setColor(Color.PINK);
		Color c = critB.getColor().brighter();
//		critB.getColor().darker().
		System.out.println(critB.getColor());
		world.add(new Location(15, 15), critB);


//		Rock c = new Rock();
//		c.setColor(Color.RED);
//		world.add(new Location(8, 8), c);
//		ChameleonKid critC = new ChameleonKid();
//		world.add(new Location(8, 7), critC);
	
		world.show();
	}

}
