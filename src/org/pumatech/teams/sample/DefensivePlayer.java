package org.pumatech.teams.sample;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.pumatech.ctf.AbstractPlayer;
import org.pumatech.ctf.Flag;
import org.pumatech.ctf.Team;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class DefensivePlayer extends AbstractPlayer {
	public static int i = 0;

	public DefensivePlayer(Location startLocation) {
		super(startLocation);
	}

	private boolean theyHaveFlag() {
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();

		for (int i = 0; i < theirPlayers.size(); i++) {
			if (theirPlayers.get(i).hasFlag()) {
				return true;
			}
		}
		return false;
	}

	private AbstractPlayer whoHasFlag() {
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();

		for (int i = 0; i < theirPlayers.size(); i++) {
			if (theirPlayers.get(i).hasFlag()) {
				return theirPlayers.get(i);
			}
		}
		return null;
	}

	public Location getMoveLocation() {
		Location loc = this.getLocation();
		Grid myGrid = this.getGrid();
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
		Flag theirFlag = theirTeam.getFlag();
		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation());

		Location opp;
		if (theyHaveFlag()) {
			this.setDirection(loc.getDirectionToward(whoHasFlag().getLocation()));
			opp = loc.getAdjacentLocation(loc.getDirectionToward(whoHasFlag().getLocation()));
			if (possibleMoveLocations.indexOf(opp) >= 0) {
				return opp;
			}
		}
//		else {
//			this.setDirection(loc.getDirectionToward(theirFlag.getLocation()));
			return upDown();
//		}
//		Location front = loc.getAdjacentLocation(getDirection());
//		Location north = loc.getAdjacentLocation(Location.NORTH - 45);
//		Location south = loc.getAdjacentLocation(Location.SOUTH - 45);
//		Location diag1 = loc.getAdjacentLocation(loc.getDirectionToward(front) + 45);
//		Location diag2 = loc.getAdjacentLocation(loc.getDirectionToward(front) - 45);
//		Location back = loc.getAdjacentLocation(getDirection() + 180);
//		Location back1 = loc.getAdjacentLocation(getDirection() + 135);
//		Location back2 = loc.getAdjacentLocation(getDirection() + 225);
	
//		if (possibleMoveLocations.size() == 0) {
//			return null;
//		}
//		else if (possibleMoveLocations.indexOf(opp) >= 0) {
//			return opp;
//		}
//		return upDown();
//		
		
//		else if (possibleMoveLocations.indexOf(diag1) >= 0 && possibleMoveLocations.indexOf(diag2) >= 0) {
//			double n = Math.random();
//			if (n < .7) {
//				return diag1;
//			}
//			return diag2;
//		} else if (possibleMoveLocations.indexOf(diag1) >= 0) {
//			return diag1;
//		} else if (possibleMoveLocations.indexOf(diag2) >= 0) {
//			return diag2;
//		} else if (possibleMoveLocations.indexOf(north) >= 0 && possibleMoveLocations.indexOf(south) >= 0) {
//			double n = Math.random();
//			if (n < .5) {
//				return north;
//			}
//			return south;
//		} else if (possibleMoveLocations.indexOf(north) >= 0) {
//			return north;
//		} else if (possibleMoveLocations.indexOf(south) >= 0) {
//			return south;
//		} else if (possibleMoveLocations.indexOf(back1) >= 0 && possibleMoveLocations.indexOf(back2) >= 0) {
//			double n = Math.random();
//			if (n < .5) {
//				return back1;
//			}
//			return back2;
//		} else if (possibleMoveLocations.indexOf(back1) >= 0) {
//			return back1;
//		} else if (possibleMoveLocations.indexOf(back2) >= 0) {
//			return back2;
//		}
//		return back;
	}

	public Location upDown() {
		Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
		if ((this.getGrid().isValid(south)) && (i % 2 == 0)) {
			if (this.getGrid().get(south) == null) {
				i++;
				return south;
			}
		} else {
			Location north = this.getLocation().getAdjacentLocation(Location.NORTH);
			if ((this.getGrid().isValid(north)) && (i % 2 == 1)) {
				if (this.getGrid().get(north) == null) {
					i++;
					return north;
				}
			}
		}

		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation());
		if (possibleMoveLocations.size() == 0)
			return null;
		return possibleMoveLocations.get((int) (Math.random() * possibleMoveLocations.size()));

	}

	public Location random() {
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
