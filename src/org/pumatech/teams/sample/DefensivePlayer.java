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

	public DefensivePlayer(Location startLocation) {
		super(startLocation);
	}

	public Location getMoveLocation() {
		Location myLoc = this.getLocation();
		Grid myGrid = this.getGrid();
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
		Flag theirFlag = theirTeam.getFlag();
		
		List<Location> possibleMoveLocations = getGrid().getEmptyAdjacentLocations(getLocation()); 
		if (possibleMoveLocations.size() == 0) return null;
		return possibleMoveLocations.get((int) (Math.random() * possibleMoveLocations.size()));
	}

}
