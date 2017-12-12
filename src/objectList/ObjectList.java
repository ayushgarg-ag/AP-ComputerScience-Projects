package objectList;

import java.util.Arrays;

/**
 * ObjectList is a class that behaves much like a variable-sized array – a runner will be able to create a new empty ObjectList and then add items to the list, access the values in the list, change items in the list, get the effective size of the list, determine the maximum value, the minimum value, etc.
 * @author agarg01
 * 10/31
 * Extensions: toArray method and contain method
 */
public class ObjectList <E> {
	
	private E[] myList;
	private int mySize;
	
	/**
	 * Creates a MyList with an empty array of Objects of size 20, a mySize with a value of 0
	 */
	public ObjectList() {
		myList = (E[]) new Object[20];
		mySize = 0;
	}
	
	/**
	 * Initialize myList as a new Object array of the specified size
	 * @param i: the size of the Object List array
	 * Precondition: the specified value is not 0
	 */
	public ObjectList (int i) {
		myList = (E[]) new Object[i];
		mySize = 0;
	}
	
	/**
	 * Initializes myList as a new Object array the size of the passed array plus 20
	 * @param arr: a Object array that is added to the Object List
	 * Postcondition: the values from the passed array are added to the ObjectList
	 */
	public ObjectList (E[] arr) {
		myList = (E[]) new Object[arr.length + 20];
		mySize = 0;
		
		for (E arrVal: arr) {
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
	 * Adds an item to the end of the ObjectList
	 * @param d item the value to be added
	 * Precondition: list is not full
	 * Postcondition: item is added to the end of the list
	 * @throws RuntimeException if list is full
	*/
	public void add (E o) {
		if (mySize < maxSize()) {

			myList[mySize] = o;
			mySize++;
		}
		else {
			throw new IndexOutOfBoundsException("The ObjectList is full.");
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
	public E remove() {
		if (mySize == 0) {
			throw new IndexOutOfBoundsException("The ObjectList is empty.");
		}
		else {
			mySize--;
			return myList[mySize];
		}
	}

	/**
	 * Returns the position of the first occurrence of the given value in the ObjectList
	 * @param d the Object value you are searching for
	 * @return index (integer) of the first occurrence of the given value
	 */
	public int indexOf(E o) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Returns the largest item in the effective list
	 * @return the largest item in the effective list
	 * Precondition: list is not empty
	 * @throws IndexOutOfBoundsException if list empty
	 */	
//	public Object maximum () {
//		Object max = myList[0];
//		if (mySize == 0) {
//			throw new IndexOutOfBoundsException("The ObjectList is empty.");
//		}
//		for (int i = 0; i < mySize; i++) {
//			if (myList[i] > max) {
//				max = myList[i];
//			}
//		}
//		return max;
//	}

	/**
	 * Returns the smallest item in the effective list
	 * @return the smallest item in the effective list
	 * Precondition: list is not empty
	 * @throws IndexOutOfBoundsException if list empty
	 */	
//	public Object minimum () {
//		Object min = myList[0];
//		if (mySize == 0) {
//			throw new IndexOutOfBoundsException("The ObjectList is empty.");
//		}
//		for (int i = 0; i < mySize; i++) {
//			if (myList[i] < min) {
//				min = myList[i];
//			}
//		}
//		return min;
//	}

	/**
	 * Return the value of the ObjectList stored at that index
	 * @param index the index of the value that will be returned
	 * Precondition: the list is not empty and the requested index is not out of bounds
	 * @return the value at the provided index
	 * @throws IndexOutOfBoundsException if list is full or if the index is out of bounds
	 */
	public E get(int index) {
		if (mySize < 0 || index >= mySize || index < 0) {
			throw new IndexOutOfBoundsException("The index is out of bounds.");
		}
		return myList[index];
	}
	
	/** 
	 * Sets the value of the ObjectList stored at the index to the passed value
	 * @param index: the index of the value that will be set
	 * @param d: the value that will be set
	 * Precondition: the requested index is in the effective size
	 * Postcondition: the specified value is set at the specified index
	 * @throws IndexOutOfBoundsException if the index is out of the effective size
	 */
	public void set(int index, E o) {
		if (index >= mySize || index < 0)  {
			throw new IndexOutOfBoundsException("The index is not in the effective size.");			
		}
			myList[index] = o;
	}
	
	/**
	 * Inserts the item into the array and moves all the following items one position to "make room" for the item
	 * @param index: the index of the value that will be added
	 * @param d: the value that will be added
	 * Precondition: the specified index is not out of bounds and there is room in the array to add one more item
	 * Postcondition: the specified value is inserted into the array at the specified index and all the following items move one position to "make room" for the item
	 * @throws IndexOutOfBoundsException if there is no room in the array or if the index is out of bounds
	 */
	public void add (int index, E o) {
		if (mySize + 1 > maxSize()) {
			throw new IndexOutOfBoundsException("There is no room in the array.");
		}
		
		if (index >= mySize || index < 0) {
			throw new IndexOutOfBoundsException("The specified index is out of bounds.");
		}
		
		mySize++;
		for (int i = mySize-1; index <= i; i--) {
			myList[i] = myList[i-1];
		}
		myList[index] = o;
	}
	
	/**
	 * Removes the item located at the specified index and moves all the following items down one position
	 * @param index: the index of the value that will be removed
	 * Precondition: the specified index is not out of bounds
	 * Postcondition: the value at the specified is removed from the array and all the following items move down one position
	 * @throws IndexOutOfBoundsException if the index is out of bounds
	 */
	public void remove(int index) {
		if (index >= mySize || index < 0) {
			throw new IndexOutOfBoundsException("The specfied index is out of bounds.");
		}
		for (int i = index; i < mySize-1; i++) {
			myList[i] = myList[i+1];
		}
		mySize--;			
	}
	
	/**
	 * Removes all items in the list
	 * Precondition: the list is not already empty
	 * Postcondition: the list is cleared
	 */
	public void clear() {
		mySize = 0;
	}
	
	/**
	 * Returns true only if the passed ObjectList contains identical item to "this"  ObjectList
	 * @param o: another ObjectList
	 * @return a boolean depending on whether the passed ObjectList contains identical item to "this"  ObjectList
	 */
	public boolean equals(ObjectList o) {
		if (mySize != o.size()) {
			return false;
		}
		for (int i = 0; i < mySize; i++) {
			if (!(myList[i].equals(o.get(i)))) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns true only if the ObjectList contains no items
	 * @return a boolean depending on whether the list is empty or not
	 */
	public boolean isEmpty() {
		if (mySize == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns an array containing only the current items in the ObjectList
	 * @return an array containing only the current items in the ObjectList
	 */
	public E[] toArray() {
		E[] arr = (E[]) new Object[mySize]; 
		for (int i = 0; i < mySize; i++) {
			arr[i] = myList[i];
		}
		return arr;
	}
	
	/**
	 * Returns a boolean depending on whether or not that Object is in the ObjectList
	 * @param d: the Object that is being checked to see if it is in the ObjectList
	 * @return a boolean depending on whether or not that Object is in the ObjectList
	 */
	public boolean contains(E o) {
		for (int i = 0; i < mySize; i++) {
			if (myList[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
	
	public void sort () {
		Arrays.sort(myList, 0, mySize);
	}
	
//	public int binarySearch (Object val) {
//		int left = 0;
//		int right = mySize - 1;
//		while (left <= right) {
//			int mid = (left + right)/2;
//			if (myList[mid].equals(val)) {
//				return mid;
//			}
//			else if (myList[mid] < val) {
//				left = mid + 1;
//			}
//			else {
//				right = mid - 1;
//			}
//		}
//		return -1;
//	}
}
