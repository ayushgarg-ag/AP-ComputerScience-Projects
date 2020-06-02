package GWpart4;

import java.util.ArrayList;

import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class ChameleonKid extends ChameleonCritter {

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		ArrayList<Location> a = new ArrayList<Location>();
		a.add(this.getLocation().getAdjacentLocation(getDirection() + 180));
		a.add(this.getLocation().getAdjacentLocation(getDirection()));
		if (this.getGrid().isValid(a.get(0))) {
			if (this.getGrid().get(a.get(0)) != null) {
				actors.add(getGrid().get(a.get(0)));
			}
		}
		if (this.getGrid().isValid(a.get(1))) {
			if (this.getGrid().get(a.get(1)) != null) {
				actors.add(getGrid().get(a.get(1)));
			}
		}

		return actors;
	}

}
