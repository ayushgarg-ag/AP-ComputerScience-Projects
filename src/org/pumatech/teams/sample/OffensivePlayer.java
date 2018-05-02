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

	public Location getMoveLocation() {
		// if (hasFlag())
		// return getTeam().getFlag().getLocation();
		// return getTeam().getOpposingTeam().getFlag().getLocation();

		Location myLoc = this.getLocation();
		Grid myGrid = this.getGrid();
		Team myTeam = this.getTeam();
		Team theirTeam = myTeam.getOpposingTeam();
		List<AbstractPlayer> theirPlayers = theirTeam.getPlayers();
		Flag theirFlag = theirTeam.getFlag();
		
		int directionTowardsTheirFlag = myLoc.getDirectionToward(theirFlag.getLocation());
		this.setDirection(myLoc.getDirectionToward(theirFlag.getLocation()));
//				this.getLocation().getAdjacentLocation(Location.EAST);
		Location locationTowardsTheirFlag = myLoc.getAdjacentLocation(getDirection());
		if (this.getGrid().isValid(locationTowardsTheirFlag)) {
			if (this.getGrid().get(locationTowardsTheirFlag) == null) {
				return (locationTowardsTheirFlag);
			}
			else {
				Location south = this.getLocation().getAdjacentLocation(Location.SOUTH);
				if (this.getGrid().isValid(south)) {
					if (this.getGrid().get(south) == null) {
						return (south);
					}
					else {
						Location north = this.getLocation().getAdjacentLocation(Location.NORTH);
						if (this.getGrid().isValid(north)) {
							if (this.getGrid().get(north) == null) {
								return (north);
							}
							else {
								return this.getLocation().getAdjacentLocation(Location.WEST) ;
							}
						}
					}
				}
			}
		}
		return locationTowardsTheirFlag;
	}

}
