package org.pumatech.ctf;

import java.awt.Color;

import org.pumatech.teams.XLpackage.AGAKTeam;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;

public class SimpleRunner {

	public static void main(String[] args) {
		BoundedGrid<Actor> grid = new BoundedGrid<Actor>(50, 100);
		ActorWorld world = new ActorWorld(grid);
		
		Team a = new AGAKTeam(Color.RED);
		Team b = new AGAKTeam(Color.BLUE);
		a.addTeamToGrid(grid, 0);
		b.addTeamToGrid(grid, 1);
		a.setOpposingTeam(b);
		b.setOpposingTeam(a);
		
		world.show();
	}
	
}
