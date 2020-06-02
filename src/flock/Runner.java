package flock;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class Runner {

	public static void main(String[] args) {
		Grid<Actor> grid = new BoundedGrid<Actor>(25, 40);
		FlockWorld world = new FlockWorld(grid);
		
		for (int i = 0; i < 40; i++) {
			world.add(new Rock());
		}
		for (int i = 0; i < 15; i++) {
			world.add(new Bird());
		}
		world.show();
	}

}
