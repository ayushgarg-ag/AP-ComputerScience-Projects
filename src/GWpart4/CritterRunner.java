package GWpart4;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class CritterRunner {

	public static void main(String[] args) {
		Grid g = new UnboundedGrid();
		ActorWorld world = new ActorWorld(g);
		world.add(new Rock());
		for (int i = 0; i < 10; i++) {
			world.add(new Critter());
			world.add(new Bug());
			world.add(new Rock());
			world.add(new Rock());
		}
		world.show();
	}
}
