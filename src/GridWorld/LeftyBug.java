package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class LeftyBug extends Bug {
	public void turn() {
        setDirection(getDirection() + Location.HALF_LEFT);
	}
	public String toString() {
		return super.toString() + "Hi, I'm a \"LeftyBug\"!";
	}
	public LeftyBug () {
		super ();
		setColor (Color.GREEN);
	}
}