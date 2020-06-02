package GWpart4;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class RockHoundCritter {

	public static void main(String[] args) {
		Grid<Actor> grid = new BoundedGrid<Actor>(20, 20);
		ActorWorld world = new ActorWorld (grid);
		
		Rock a = new Rock();
		a.setColor(Color.BLUE);
		world.add(new Location(2, 2), a);
		RockHound critA = new RockHound();
		world.add(new Location(1, 2), critA);
		
		Rock b = new Rock();
		b.setColor(Color.GREEN);
		world.add(new Location(4, 4), b);
		RockHound critB = new RockHound();
		world.add(new Location(5, 4), critB);

		Rock c = new Rock();
		c.setColor(Color.RED);
		world.add(new Location(8, 8), c);
		RockHound critC = new RockHound();
		world.add(new Location(8, 7), critC);
	

		world.show();
	}

}
