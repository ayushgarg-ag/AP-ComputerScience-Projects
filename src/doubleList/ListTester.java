package doubleList;

import java.util.Arrays;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor
		System.out.println("Testing Constructor");
		DoubleList aList;
		aList = new DoubleList();
		System.out.println("size: " + aList.size());
		System.out.println("max size: " + aList.maxSize());

		// Add and toString
		System.out.println("\nTesting add and toString");
		System.out.println("List is: " + aList);

		try {
			aList.add(12.0);
			aList.add(-1.0E305);
			System.out.println("List is: " + aList);
			for (int i = 0; i < 18; i++) {
				aList.add((double) i);
			}
			System.out.println("List is: " + aList);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		System.out.println("Trying to add to a full list");
		try {
			aList.add(100.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Constructor 2
		System.out.println("\nTesting Overloaded Constructor");
		aList = new DoubleList(5);
		System.out.println("size: " + aList.size());
		System.out.println("max size: " + aList.maxSize());
		System.out.println("List is" + aList);
		
		// Constructor 3
		double[] arr = new double[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double) i;
		}
		System.out.println("\nTesting Constructor 3");
		DoubleList aList3 = new DoubleList(arr);
		System.out.println("size: " + aList3.size());
		System.out.println("max size: " + aList3.maxSize());
		System.out.println("Constructs List 3 with an array arr");
		System.out.println("List is: " + aList3 + "\n");

		// Remove
		double[] arr2 = new double[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (double) i;
		}
		System.out.println("Testing Remove Method");
		DoubleList aList4 = new DoubleList(arr2);
		double r;
		System.out.println ("List is: " + aList4);
		for (int i = 0; i < arr2.length; i++) {
			r = aList4.remove();
			System.out.println("Removed Value: " + r);
			System.out.println ("List is now: " + aList4);
		}
		
		System.out.println ("Tries to remove a value from an empty list: ");		
		try {
			aList4.remove(); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// IndexOf
		System.out.println("\nTesting indexOf Method (-1 means not found)");
		System.out.println ("List is: " + aList3);
		System.out.println("First occurence of 0.0 is " + aList3.indexOf(0.0));
		System.out.println("First occurence of 2.0 is " + aList3.indexOf(2.0));
		System.out.println("First occurence of 5.0 is " + aList3.indexOf(5.0));
		
		// List 3 and List 4
		System.out.println("\n\nList 3 is: " + aList3);
		System.out.println("List 4 is: " + aList4);

		
		// Sum
		System.out.println("\nTesting sum Method");
		System.out.println("The sum of List 3 is " + aList3.sum());
		System.out.println("The sum of List 4 is " + aList4.sum());
		
		// Mean
		System.out.println("\nTesting mean Method");
		System.out.println("The mean of List 3 is " + aList3.mean());
		System.out.print("The mean of List 4 is ");
		try {
			aList4.mean(); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Maximum
		System.out.println("\nTesting maximum Method");
		System.out.println("The maximum of List 3 is " + aList3.maximum());
		System.out.print("The maximum of List 4 is ");
		try {
			aList4.maximum(); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Minimum
		System.out.println("\nTesting minimum Method");
		System.out.println("The minimum of List 3 is " + aList3.minimum());
		System.out.print("The minimum of List 4 is ");
		try {
			aList4.minimum(); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Get
		System.out.println("\n\nTesting get Method");
		System.out.println("The value at index 1 of List 3 is " + aList3.get(1));
		System.out.print("The value at index 5 of List 3 is ");
		try {
			aList3.get(5); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.print("The value at index -1 of List 3 is ");
		try {
			aList3.get(-1); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Set
		System.out.println("\nTesting set Method");
		System.out.println("List 3 is: " + aList3);
		System.out.println("Sets the value at index 0 to 1.0");
		aList3.set(0, 1.0);
		System.out.println("List 3 is now: " + aList3);
		System.out.println("Tries to set the value at index 6 to 6.0");
		try {
			aList3.set(6, 6.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.print("Tries to set the value at index -1 to 3.0 ");
		try {
			aList3.set(-1, 3.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Overloaded Add
		double[] arr5 = new double[5];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = (double) i;
		}
		aList = new DoubleList(arr5);
		System.out.println("\nTesting overloaded add method");
		System.out.println("List is: " + aList);
		System.out.println("Adding 12.0 to the index of 1: ");
		aList.add(1, 12.0);
		System.out.println("List is now: " + aList);
		System.out.println("Tries to add a value to an index that is bigger than mySize: ");
		try {
			aList.add(6, 23.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		System.out.println("Tries to add a value to a negative index:v");
		try {
			aList.add(-1, 2.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
		System.out.println("Tries to add a value to an index that is bigger than mySize: ");
		try {
			aList.add(26, 26.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		DoubleList aList6 = new DoubleList(5);
		for (int i = 0; i < aList6.maxSize(); i++) {
			aList6.add(i, (int) i);
		}
		System.out.println("List 6 is: " + aList6);
		System.out.println("Trying to add a value to the index of 6 which is bigger than the maxSize: ");
		try {
			aList6.add(16, 23.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Overloaded Remove
		System.out.println("\nTesting overloaded remove method");
		System.out.println("List is: " + aList);
		System.out.println("Removing value at the index of 1: ");
		aList.remove(1);
		System.out.println(aList);
		System.out.println("Trying to remove a value from an index that is bigger than mySize: ");
		try {
			aList.remove(7); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

		// Clear
		System.out.println("\nTesting clear method");
		System.out.println("List 6 is: " + aList6);
		System.out.println("Clears list 6");
		aList6.clear();
		System.out.println("List 6 is: " + aList6);

		// IsEmpty
		System.out.println("\nTesting isEmpty method");		
		System.out.println("List is: " + aList);
		System.out.println("isEmpty: " + aList.isEmpty());
		System.out.println("List is: " + aList6);
		System.out.println("isEmpty: " + aList6.isEmpty());

		// Equals
		System.out.println("\nTesting equals method");
		double[] arr7 = new double[5];
		for (int i = 0; i < arr7.length; i++) {
			arr7[i] = (double) i;
		}
		DoubleList aList7 = new DoubleList(arr7);
		DoubleList aList8 = new DoubleList(arr7);
		System.out.println("List 7 is: " + aList7);
		System.out.println("List 8 is: " + aList8);
		System.out.println("aList7 equals aList8: " + aList7.equals(aList8));
		System.out.println("aList8 equals aList7: " + aList8.equals(aList7));
		aList7.add(2, 10.0);
		System.out.println("\nList 7 is: " + aList7);
		System.out.println("List 8 is: " + aList8);
		System.out.println("aList7 equals aList8: " + aList7.equals(aList8));
		System.out.println("aList8 equals aList7: " + aList8.equals(aList7));
		aList7.add(5.0);
		System.out.println("\nList 7 is: " + aList7);
		System.out.println("List 8 is: " + aList8);
		System.out.println("aList7 equals aList8: " + aList7.equals(aList8));
		System.out.println("aList8 equals aList7: " + aList8.equals(aList7));

		// ToArray
		System.out.println("\n\nTesting toArray method");
		System.out.println("List 5 is: " + aList);
		double[] a = aList.toArray();
		System.out.println("aList5 as an array: \n" + Arrays.toString(a));

		// Contains
		System.out.println("\nTesting contains method");
		System.out.println("List is: " + aList);
		System.out.println("2.0 is in list 5: " + aList.contains(2.0));
		System.out.println("5.0 is in list 5: " + aList.contains(5.0));
	}
}
