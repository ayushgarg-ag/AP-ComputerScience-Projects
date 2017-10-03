package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class CustomBug extends Bug
{
    private int steps;
    private int sideLength;
    private int seg;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CustomBug(int length)
    {
		setColor (Color.RED);
        steps = 0;
        sideLength = length;
        seg = 1;
    	setDirection(45);        
    }
    
	public void turnLeft() {
		setDirection(getDirection() + Location.HALF_LEFT);
	}
	
    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
//		setDirection(getDirection() + Location.HALF_LEFT);
    	if (steps < sideLength && canMove())
        {
            move();
            steps++;
        }
        else
        {
//        	for (int x = 0; x < 5; x++) {
//        		
//        	}
        	if (seg == 1) {
            	setDirection(135); 
            	seg++;
            	steps = 0;
        	}
        	else if (seg == 2) {
            	setDirection(90); 
            	seg++;
            	steps = 0;        		
        	}

        	else if (seg == 3) {
            	turn();
            	turn();
            	turn();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 4) {
            	turnLeft();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 5) {
            	turn();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 6) {
            	turnLeft();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 7){
            	turn();
            	turn();
            	turn();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 8) {
            	turnLeft();
            	turnLeft();
            	seg++;
            	steps = 0;        		
        	}
        	else if (seg == 9) {
            	turn();
            	seg++;
            	steps = 0;        		
        	}
        	else {
        		
        	}


        }
    }
}