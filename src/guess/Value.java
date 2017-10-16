package guess;

/**
 * @desciption Value is a class that creates a simple game in which the the user "guesses" a number that the computer has selected at random
 * @date 10/16/17
 * @author Ayush Garg
 */

public class Value {
	private int value;
	
	/**
	 * Sets the instance variable to a random number between 1 and 100
	 */
	public Value() {
		value = (int)(Math.random() * 100) + 1;
	}
	
	/**
	 * Sets the instance variables of value to v, respectively
	 * @param v the value
	 */
	public Value (int v) {
		value = v;
	}
	
	/**
	 * Returns the value of the object
	 * @returns the value (int) of the object
	 */
	public int getValue () {
		return value;
	}
	
	/**
	 * Compares the values of the different Value objects
	 * @param otherVal another Value
	 * @return int
	 */	

	public int compareTo (Value o) {
		if (this.getValue() == o.getValue()) {
			return 0;
		}
		else if (this.getValue() < o.getValue()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	/** (non-Javadoc)
	/* @see java.lang.Object#toString()
	*/
	public String toString () {
		return "The stored value is: "+value;
	}
}
