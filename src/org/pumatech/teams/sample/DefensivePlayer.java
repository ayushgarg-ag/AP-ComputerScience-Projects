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
	private int i = 0;
	private Location originalLocation;
	private ArrayList<Location> moved = new ArrayList<>();

	public DefensivePlayer(Location startLocation) {
		super(startLocation);
		originalLocation = startLocation;
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

	private boolean onOurSide() {
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();

		for (int i = 0; i < theirPlayers.size(); i++) {
			if (myTeam.onSide(theirPlayers.get(i).getLocation())) {
				return true;
			}
		}
		return false;
	}
	
	private AbstractPlayer whoOnOurSide() {
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();

		for (int i = 0; i < theirPlayers.size(); i++) {
			if (myTeam.onSide(theirPlayers.get(i).getLocation())) {
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
				moved.add(opp);
				return opp;
			}
		}
		if (onOurSide()) {
			this.setDirection(loc.getDirectionToward(whoOnOurSide().getLocation()));
			opp = loc.getAdjacentLocation(loc.getDirectionToward(whoOnOurSide().getLocation()));
			if (possibleMoveLocations.indexOf(opp) >= 0) {
				moved.add(opp);
				return opp;
			}
		}
		if (moved.size() == 0) {
			return upDown();
		}

		return moved.remove(moved.size()-1);
	}
	
	private boolean southValid() {
		Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
		if ((this.getGrid().isValid(south))) {
			if ((this.getGrid().get(south) == null)) {
				return true;
			}	
		}
		return false;
	}
	private boolean northValid() {
		Location north = this.getLocation().getAdjacentLocation(Location.NORTH);
		if ((this.getGrid().isValid(north))) {
			if ((this.getGrid().get(north) == null)) {
				return true;
			}	
		}
		return false;
	}

	public Location upDown() {
		Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
		Location north = this.getLocation().getAdjacentLocation(Location.NORTH);

		if (i % 2 == 0) {
			i++;
			if (southValid()) {
				moved.add(south);
				return south;
			}
		}
		else {
			i++;
			if (northValid()) {
				moved.add(north);
				return north;
			}
		}
//		if (i % 2 == 0) {
//			i++;
//			if ((this.getGrid().isValid(south)) && (this.getGrid().get(south) == null)) {
//				return south;
//			}
//		}
//		else {
//			Location north = this.getLocation().getAdjacentLocation(Location.NORTH);
//			i++;
//			if ((this.getGrid().isValid(north))) {
//				if (this.getGrid().get(north) == null) {
//					return north;
//				}
//			}
//		}

		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation());
		if (possibleMoveLocations.size() == 0)
			return null;
		return possibleMoveLocations.get((int) (Math.random() * possibleMoveLocations.size()));

	}

}