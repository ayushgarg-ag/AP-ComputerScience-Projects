package doubleList;

/**
 * DoubleList is a class that behaves much like a variable-sized array – a runner will be able to create a new empty DoubleList and then add items to the list, access the values in the list, change items in the list, get the effective size of the list, determine the maximum value, the minimum value, etc.
 * @author agarg01
 * 10/31
 */
public class DoubleList {
	
	private double[] myList;
	private int mySize;
	
	/**
	 * create a MyList with an empty array of doubles, a mySize with a value of 0
	 */
	public DoubleList() {
		myList = new double[20];
		mySize = 0;
	}
	
	/**
	 * Returns the current effective size
	 * @return the value of mySize
	 */
	public int size() {
		return mySize;
	}
	
	/**
	 * Returns the current physical (maximum) size of myList 
	 * @return the length of mySize
	 */
	public int maxSize () {
		return myList.length;
	}
}
