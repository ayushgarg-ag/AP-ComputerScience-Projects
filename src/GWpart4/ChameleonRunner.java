package GWpart4;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.UnboundedGrid;


public class ChameleonRunner {

	public static void main(String[] args) {

		Grid<Actor> grid = new BoundedGrid<Actor>(20, 20);
		ActorWorld world = new ActorWorld (grid);
		Actor a = new Actor();
		a.setColor(Color.RED);
		Actor b = new Actor();
		a.setColor(Color.GREEN);
		Actor c = new Actor();
		ChameleonCritter crit = new ChameleonCritter();
		a.setColor(Color.BLUE);
		world.add(a);
		world.add(b);
		world.add(c);
		world.add(crit);
		world.show();
	}

}
