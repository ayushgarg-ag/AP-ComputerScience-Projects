package GridWorld;


import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.UnboundedGrid;



public class Exercises
{
    public static void main(String[] args)
    {
//    	Grid<Actor> grid = new UnboundedGrid<Actor>();
//    	ActorWorld world = new ActorWorld (grid);
    	Grid<Actor> grid = new BoundedGrid<Actor>(30, 50);
    	ActorWorld world = new ActorWorld (grid);
//    	ActorWorld world = new ActorWorld();
//        MyActor pat = new MyActor ();
        world.add(new CircleBug(4));
        world.add(new SpiralBug(4));
        world.add(new ZBug(4));
        world.add(new DancingBug());


//        world.add(pat);
        world.show();
    }
}
