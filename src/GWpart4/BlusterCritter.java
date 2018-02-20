package GWpart4;

import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.world.*;
import info.gridworld.gui.*;

public class BlusterCritter extends Critter {
	private static final int c = 3;
	
    public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }
    public ArrayList<Actor> getActors()
    {
    	Location loc = this.getLocation();
    	int col = loc.getCol();
    	int row = loc.getRow();
    	
    	ArrayList<Actor> topright = getGrid().getNeighbors(new Location(row-1, col+1));
       	ArrayList<Actor> topleft = getGrid().getNeighbors(new Location(row-1, col-1));
       	ArrayList<Actor> bottomright = getGrid().getNeighbors(new Location(row+1, col+1));
       	ArrayList<Actor> bottomleft = getGrid().getNeighbors(new Location(row+1, col-1));
           	
//    	getGrid().getNeighbors(loc);
//    	for (int r = -2; r < 2; r++) {
//    		Location l = 
//    	}
//    	
//    	
//    	ArrayList<Actor> all;
//    	ArrayList<Actor> each;
//    	ArrayList<Actor> crit= getGrid().getNeighbors(getLocation());
//    	for (int i = 0; i < crit.size(); i++) {
//    		Location loc = crit.get(i).getLocation();
//			each.add((getGrid().getNeighbors(loc)));
//			for (int n = 0; n < each.size(); n++) {
//				
//			}
//		}
    }

    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (!(a instanceof Rock) && !(a instanceof Critter))
                a.removeSelfFromGrid();
        }
    }

    public ArrayList<Location> getMoveLocations()
    {
        return getGrid().getEmptyAdjacentLocations(getLocation());
    }

    public Location selectMoveLocation(ArrayList<Location> locs)
    {
        int n = locs.size();
        if (n == 0)
            return getLocation();
        int r = (int) (Math.random() * n);
        return locs.get(r);
    }

    public void makeMove(Location loc)
    {
        if (loc == null)
            removeSelfFromGrid();
        else
            moveTo(loc);
    }
}
