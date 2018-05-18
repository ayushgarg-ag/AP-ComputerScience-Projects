package org.pumatech.teams.sample;

import java.util.ArrayList;
import java.util.List;

import org.pumatech.ctf.AbstractPlayer;
import org.pumatech.ctf.Flag;
import org.pumatech.ctf.Team;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class AGAKNorthOffensivePlayer extends AbstractPlayer {

//	private ArrayList<Location> locs;

	public AGAKNorthOffensivePlayer(Location startLocation) {
		super(startLocation);
//		locs = new ArrayList<Location>();
	}

	public Location getMoveLocation() {
		Grid<Actor> gr = getGrid();
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
		Flag theirFlag = theirTeam.getFlag();
		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation());
		Location loc = this.getLocation();
		for (int i = 0; i < theirPlayers.size(); i++) {
			if (theirPlayers.get(i).hasFlag()) {
				this.setDirection(loc.getDirectionToward(getTeam().getFlag().getLocation()));
			} else {
				this.setDirection(loc.getDirectionToward(theirFlag.getLocation()));
			}
		}
		// if(hasFlag()) {
		// this.setDirection(loc.getDirectionToward(getTeam().getFlag().getLocation()));
		// }
		// else {
		// this.setDirection(loc.getDirectionToward(theirFlag.getLocation()));
		// }
		Location front = loc.getAdjacentLocation(getDirection());
		Location north = loc.getAdjacentLocation(Location.NORTH - 45);
		Location south = loc.getAdjacentLocation(Location.SOUTH - 45);
		Location diag1;
		Location diag2;
		if (this.getDirection() == Location.EAST || this.getDirection() == Location.NORTHEAST
				|| this.getDirection() == Location.SOUTHEAST) {
			diag1 = loc.getAdjacentLocation(loc.getDirectionToward(front) + 45);
			diag2 = loc.getAdjacentLocation(loc.getDirectionToward(front) - 45);
		} else if (this.getDirection() == Location.WEST || this.getDirection() == Location.NORTHWEST
				|| this.getDirection() == Location.SOUTHWEST) {
			diag1 = loc.getAdjacentLocation(loc.getDirectionToward(front) - 45);
			diag2 = loc.getAdjacentLocation(loc.getDirectionToward(front) + 45);
		} else {
			diag1 = loc.getAdjacentLocation(loc.getDirectionToward(front) + 45);
			diag2 = loc.getAdjacentLocation(loc.getDirectionToward(front) - 45);
		}
		Location back = loc.getAdjacentLocation(getDirection() + 180);
		Location back1 = loc.getAdjacentLocation(getDirection() + 135);
		Location back2 = loc.getAdjacentLocation(getDirection() + 225);
//		for (int i = 0; i < locs.size(); i++) {

			if (possibleMoveLocations.size() == 0) {
				return null;
			} else if (possibleMoveLocations.indexOf(front) >= 0
//					&& !(locs.get(i)).equals(front)
					) {
				double n = Math.random();
				if (n < .5) {
					return front;
				}
				return diag1;
			} else if (possibleMoveLocations.indexOf(diag1) >= 0 && possibleMoveLocations.indexOf(diag2) >= 0
//					&& !(locs.get(i)).equals(diag1)
					){
//				locs.add(diag1);
				double n = Math.random();
				if (n < .7) {
					return diag1;
				}
				return diag2;
			} else if (possibleMoveLocations.indexOf(diag1) >= 0
//					&& !(locs.get(i)).equals(diag1)
					) {
//				locs.add(diag1);
				return diag1;
			} else if (possibleMoveLocations.indexOf(diag2) >= 0
//					&& !(locs.get(i)).equals(diag2)
					) {
//				locs.add(diag2);
				return diag2;
			} else if (possibleMoveLocations.indexOf(north) >= 0 && possibleMoveLocations.indexOf(south) >= 0
//					&& !(locs.get(i)).equals(north)
					) {
				double n = Math.random();
				if (n < .5) {
					return north;
				}
				return south;
			} else if (possibleMoveLocations.indexOf(north) >= 0
//					&& !(locs.get(i)).equals(north)
					) {
				return north;
			} else if (possibleMoveLocations.indexOf(south) >= 0
//					&& !(locs.get(i)).equals(south)
					) {
				return south;
			} else if (possibleMoveLocations.indexOf(back1) >= 0 && possibleMoveLocations.indexOf(back2) >= 0
//					&& !(locs.get(i)).equals(back1)
					) {
				double n = Math.random();
//				locs.add(back1);
//				locs.add(back2);
				if (n < .5) {
					return back1;
				}
				return back2;
			} else if (possibleMoveLocations.indexOf(back1) >= 0
//					&& !(locs.get(i)).equals(back1)
					) {
//				locs.add(back1);
				return back1;
			} else if (possibleMoveLocations.indexOf(back2) >= 0
//					&& !(locs.get(i)).equals(back2)
					) {
//				locs.add(back2);
				return back2;
			}
			return back;
//		}
//		return front;
	}

}