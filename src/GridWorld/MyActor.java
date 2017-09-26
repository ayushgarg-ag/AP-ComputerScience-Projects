package GridWorld;
import java.awt.Color;

import info.gridworld.actor.Actor;
public class MyActor extends Actor {
	
	public String toString () {
		return super.toString() + 
				"Hi, I'm a \"My Actor\"!";
	}
	
	public MyActor () {
		super ();
		setColor (Color.BLUE);
	}
}
