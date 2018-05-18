package org.pumatech.teams.sample;

import java.awt.Color;

import org.pumatech.ctf.Team;

import info.gridworld.grid.Location;

public class AGAKTeam extends Team {

	public AGAKTeam() {
		this(Color.DARK_GRAY);
	}
	
	public AGAKTeam(Color color) {
		this("Sample Team", color);
	}
	
	public AGAKTeam(String name, Color color) {
		super(name, color);

		addPlayer(new AGAKNorthOffensivePlayer(new Location(5, 30)));
		addPlayer(new AGAKNorthOffensivePlayer(new Location(10, 30)));
		
		addPlayer(new AGAKNorthDefensivePlayer(new Location(15, 30)));
		addPlayer(new AGAKNorthDefensivePlayer(new Location(20, 30)));
		
		addPlayer(new AGAKSouthDefensivePlayer(new Location(30, 30)));
		addPlayer(new AGAKSouthDefensivePlayer(new Location(35, 30)));
		
		addPlayer(new AGAKSouthOffensivePlayer(new Location(40, 30)));
		addPlayer(new AGAKSouthOffensivePlayer(new Location(45, 30)));
		
		
//		addPlayer(new BeelinePlayer(new Location(5, 30)));
//		addPlayer(new BeelinePlayer(new Location(10, 30)));
//		addPlayer(new BeelinePlayer(new Location(15, 30)));
//		addPlayer(new RandomPlayer(new Location(20, 30)));
//		addPlayer(new RandomPlayer(new Location(30, 30)));
//		addPlayer(new RandomPlayer(new Location(35, 30)));
//		addPlayer(new RandomPlayer(new Location(40, 30)));
//		addPlayer(new RandomPlayer(new Location(45, 30)));
	}

}
