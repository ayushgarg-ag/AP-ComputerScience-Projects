package org.pumatech.teams.sample;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.pumatech.ctf.AbstractPlayer;
import org.pumatech.ctf.Flag;
import org.pumatech.ctf.Team;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class OffensivePlayer extends AbstractPlayer {

	public OffensivePlayer(Location startLocation) {
		super(startLocation);
	}

//	public Location getMoveLocation() {
//		// if (hasFlag())
//		// return getTeam().getFlag().getLocation();
//		// return getTeam().getOpposingTeam().getFlag().getLocation();
//
//		Location myLoc = this.getLocation();
//		Grid myGrid = this.getGrid();
//		Team myTeam = this.getTeam();
//		Team theirTeam = myTeam.getOpposingTeam();
//		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
//		Flag theirFlag = theirTeam.getFlag();
//		
//		int directionTowardsTheirFlag = myLoc.getDirectionToward(theirFlag.getLocation());
//		this.setDirection(myLoc.getDirectionToward(theirFlag.getLocation()));
////				this.getLocation().getAdjacentLocation(Location.EAST);
//		Location locationTowardsTheirFlag = myLoc.getAdjacentLocation(getDirection());
//		if (this.getGrid().isValid(locationTowardsTheirFlag)) {
//			if (this.getGrid().get(locationTowardsTheirFlag) == null) {
//				return (locationTowardsTheirFlag);
//			}
//			else {
//				Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
//				if (this.getGrid().isValid(south)) {
//					if (this.getGrid().get(south) == null) {
//						return (south);
//					}
//					else {
//						Location north = this.getLocation().getAdjacentLocation(Location.NORTH);
//						if (this.getGrid().isValid(north)) {
//							if (this.getGrid().get(north) == null) {
//								return (north);
//							}
//							else {
//								return this.getLocation().getAdjacentLocation(Location.WEST) ;
//							}
//						}
//					}
//				}
//			}
//		}
//		return locationTowardsTheirFlag;
//	}
	
	public Location getMoveLocation() {
//		Grid<Actor> gr = getGrid();
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
		Flag theirFlag = theirTeam.getFlag();
		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation()); 
		Location loc = this.getLocation();
		if(hasFlag()) {
			this.setDirection(loc.getDirectionToward(getTeam().getFlag().getLocation()));
		}
		else {
			this.setDirection(loc.getDirectionToward(theirFlag.getLocation()));
		}
		Location front = loc.getAdjacentLocation(getDirection());
		Location north = loc.getAdjacentLocation(Location.NORTH - 45);
		Location south = loc.getAdjacentLocation(Location.SOUTH - 45);
		Location diag1 = loc.getAdjacentLocation(loc.getDirectionToward(front) + 45);
		Location diag2 = loc.getAdjacentLocation(loc.getDirectionToward(front) - 45);
		Location back = loc.getAdjacentLocation(getDirection() + 180);
		Location back1 = loc.getAdjacentLocation(getDirection() + 135);
		Location back2 = loc.getAdjacentLocation(getDirection() + 225);
		if (possibleMoveLocations.size() == 0) {
			return null;
		}
		else if(possibleMoveLocations.indexOf(front) >= 0) {
			double n = Math.random();
			if(n < .5) {
				return front;
			}
			return diag1;
		}
		else if(possibleMoveLocations.indexOf(diag1) >= 0 && possibleMoveLocations.indexOf(diag2) >= 0) {
			double n = Math.random();
			if(n < .7) {
				return diag1;
			}
			return diag2;
		}
		else if(possibleMoveLocations.indexOf(diag1) >= 0) {
			return diag1;
		}
		else if(possibleMoveLocations.indexOf(diag2) >= 0) {
			return diag2;
		}
		else if(possibleMoveLocations.indexOf(north) >= 0 && possibleMoveLocations.indexOf(south) >= 0) {
			double n = Math.random();
			if(n < .5) {
				return north;
			}
			return south;
		}
		else if(possibleMoveLocations.indexOf(north) >= 0) {
			return north;
		}
		else if(possibleMoveLocations.indexOf(south) >= 0) {
			return south;
		}
		else if(possibleMoveLocations.indexOf(back1) >= 0 && possibleMoveLocations.indexOf(back2) >= 0) {
			double n = Math.random();
			if(n < .5) {
				return back1;
			}
			return back2;
		}
		else if(possibleMoveLocations.indexOf(back1) >= 0) {
			return back1;
		}
		else if(possibleMoveLocations.indexOf(back2) >= 0) {
			return back2;
		}
		return back;
	}

}
