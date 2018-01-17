package gw3;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class GW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location loc = new Location (3, 4);
		System.out.println (loc);
		System.out.println (loc.getAdjacentLocation(Location.NORTH));
		System.out.println 
		(loc.getDirectionToward(new Location (2, 2)));
		System.out.println 
		(loc.compareTo(new Location (1, 3)));
		
	}

}
