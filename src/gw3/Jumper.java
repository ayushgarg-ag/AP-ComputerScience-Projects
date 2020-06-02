package gw3;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class Jumper extends Actor {

	public Jumper() {
		setColor(Color.RED);
	}

	/**
	 * Constructs a bug of a given color.
	 * @param bugColor the color for this bug
	 */
	public Jumper(Color bugColor) {
		setColor(bugColor);
	}
	
    /**
     * Moves if it can move, turns otherwise.
     */
    public void act()
    {
        if (canJump())
            jump();
        else
            turn();
    }

    /**
     * Turns the bug 45 degrees to the right without changing its location.
     */
    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }

    /**
     * Moves the bug forward, putting a flower into the location it previously
     * occupied.
     */
    public void jump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location middle = loc.getAdjacentLocation(getDirection());
        Location next = middle.getAdjacentLocation(getDirection());
       
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }

    /**
     * Tests whether this bug can move forward into a location that is empty or contains a flower.
     * @return true if this bug can move.
     */
    public boolean canJump()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location middle = loc.getAdjacentLocation(getDirection());
        Location next = middle.getAdjacentLocation(getDirection());
        
        if (!gr.isValid(next) || !gr.isValid(middle))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
}
