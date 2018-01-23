package flock;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


public class Bird extends Actor{
	public static boolean flock = false;
	
	
	public static boolean getFlock() {
		return Bird.flock;
	}
	public static void setFlock(boolean flock) {
		Bird.flock = flock;
	}
	
	public void act() {
		if (Bird.flock == true) {
			this.setColor (Color.BLUE);
			ArrayList<Location> empty = this.getGrid().getEmptyAdjacentLocations(this.getLocation());
			
			int rand = (int)Math.random()*empty.size();
		}
		else {
			this.setColor (Color.RED);
			
		}
	}
}
