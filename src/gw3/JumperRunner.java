package gw3;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class JumperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    	Grid<Actor> grid = new UnboundedGrid<Actor>();
//    	ActorWorld world = new ActorWorld (grid);
    	Grid<Actor> grid = new BoundedGrid<Actor>(10, 10);
    	ActorWorld world = new ActorWorld (grid);
//    	ActorWorld world = new ActorWorld();
        world.add(new Jumper());
        world.add(new Rock());
        world.add(new Flower());
        world.show();
	}

}
