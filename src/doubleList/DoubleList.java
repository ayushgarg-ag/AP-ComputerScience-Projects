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
	 * create a MyList with an empty array of doubles of size 20, a mySize with a value of 0
	 */
	public DoubleList() {
		myList = new double[20];
		mySize = 0;
	}
	
	/**
	 * create a MyList with an empty array of doubles of size i, a mySize with a value of 0
	 * @param i
	 */
	public DoubleList (int i) {
		myList = new double[i];
		mySize = 0;
	}
	
	public DoubleList (double[] arr) {
		myList = new double[arr.length + 20];
		mySize = 0;
		
		for (double arrVal: arr) {
			this.add(arrVal);
		}
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
	
	/**
	 * Adds an item to the end of the DoubleList
	 * @param item the value to be added
	 * Precondition: list is not full
	 * Postcondition: item is added to the end of the list
	 * @throws RuntimeException if list is full
	*/
	public void add (double d) {
		if (mySize < maxSize()) {

			myList[mySize] = d;
			mySize++;
		}
		else {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		}
	}
	
	/** (non-Javadoc)
	* @see java.lang.Object#toString()
	*/
	public String toString() {
		String str = new String();
		if (mySize == 0) {
			str = "Empty";
		}
		else {
			for (int i = 0; i < mySize;i++) {
				str += "["+i+"]="+myList[i]+"; ";
			}
		}
		return str;
	}
	
	public double remove() {
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		else {
			mySize--;
			return myList[mySize];
		}
	}
	
	public int indexOf(double d) {
		for (int i = 0; i < mySize; i++) {
			if (i == d) {
				return i;
			}
		}
		return -1;
	}
}
