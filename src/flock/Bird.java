package flock;

import java.awt.Color;
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
		}
		else {
			this.setColor (Color.RED);
			
		}
	}
}
