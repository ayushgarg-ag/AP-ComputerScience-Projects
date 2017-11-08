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
	
	/**
	 * Removes an item from the end of the List
	 * @return the value of the item that was removed
	 * Precondition: list is not full
	 * Postcondition: item is removed from the end of the list
	 * @throws IndexOutOfBoundsException if list empty
	 */	
	public double remove() {
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		else {
			mySize--;
			return myList[mySize];
		}
	}

	/**
	 * Returns the position of the first occurrence of the given value in the DoubleList
	 * @param d the double value you are searching for
	 * @return index (integer) of the first occurrence of the given value
	 */
	public int indexOf(double d) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i] == d) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Adds up all the values in a list
	 * @return the sum of the list if it is not empty
	 */	
	public double sum() {
		int sum = 0;
		if (mySize == 0) {
			return 0;
		}
		for (int i = 0; i < mySize; i++) {
			sum += myList[i];
		}
		return sum;
	}
	
	/**
	 * Calculates the average value in the list
	 * @return the average of all items in the effective list
	 * Precondition: list is not empty
	 * @throws IndexOutOfBoundsException if list empty
	 */	
	public double mean () {
		double sum = 0;
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		for (int i = 0; i < mySize; i++) {
			sum += myList[i];
		}
		double mean = sum/(mySize);
		return mean;
	}

	/**
	 * Returns the largest item in the effective list
	 * @return the largest item in the effective list
	 * Precondition: list is not empty
	 * @throws IndexOutOfBoundsException if list empty
	 */	
	public double maximum () {
		double max = myList[0];
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		for (int i = 0; i < mySize; i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		return max;
	}

	/**
	 * Returns the smallest item in the effective list
	 * @return the smallest item in the effective list
	 * Precondition: list is not empty
	 * @throws IndexOutOfBoundsException if list empty
	 */	
	public double minimum () {
		double min = myList[0];
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The DoubleList is empty.");
		}
		for (int i = 0; i < mySize; i++) {
			if (myList[i] < min) {
				min = myList[i];
			}
		}
		return min;
	}

	public double get(int index) {
		if (mySize < 0 || index >= mySize ) {
			throw new IndexOutOfBoundsException("The index is out of bounds.");
		}
		return myList[index];
	}
	
	public void set(int index, double d) {
		if (index >= mySize)  {
			throw new IndexOutOfBoundsException("The index is not in the effective size.");			
		}
			myList[index] = d;
	}
	
	public void add (int index, double d) {
		if (index > mySize) {
			throw new IndexOutOfBoundsException("The specified index is out of bounds.");
		}
		
		if (mySize > maxSize()) {
			throw new IndexOutOfBoundsException("There is no room in the array.");
//			throw new RejectedExecutionException("There is no room in the array.");
		}
		
		for (int i = index; i < mySize - index; i++) {
			myList[i + 1] = myList[i];
		}
		myList[index] = d;
	}
	
	public void remove(int index) {
		if (index >= mySize) {
			throw new IndexOutOfBoundsException("The specfied index is out of bounds.");
		}
		for (int i = index; i < mySize - index; i--) {
			myList[i] = myList[i+1];
		}
		mySize--;			
	}
	
	public void clear() {
		for (int i = 0; i < mySize; i++) {
			myList[i] = 0.0;
		}
	}
	
	public boolean equals(DoubleList o) {
		boolean same = true;
		for (int i = 0; i < mySize; i++) {
			if (myList[i] != o.get(i)) {
				return false;
			}
		}
		return same;
	}
	
	public boolean isEmpty() {
		if (mySize == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double[] toArray() {
		double[] arr = new double[mySize]; 
		for (int i = 0; i < mySize; i++) {
			arr[i] = myList[i];
		}
		return arr;
	}
	
	public boolean contains(double d) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i] == d) {
				return true;
			}
		}
		return false;
	}
}
