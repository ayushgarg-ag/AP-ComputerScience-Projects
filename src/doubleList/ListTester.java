package doubleList;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Testing Constructor");
		DoubleList aList = new DoubleList ();
		System.out.println ("size: " + aList.size());
		System.out.println ("max size: " + aList.maxSize());
		
		System.out.println ("Testing add and toString");
		System.out.println ("List is: " + aList);
		aList.add (12.0);
		aList.add (-1.0E305);
		System.out.println ("List is: " + aList);
		for (int i = 0; i<18; i++) aList.add ((double)i);
		try {
		   aList.add (100.0);  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		System.out.println ("List is: " + aList);
		
		System.out.println ("Testing Constructor 2");
		DoubleList aList2 = new DoubleList (5);
		System.out.println ("size: " + aList2.size());
		System.out.println ("max size: " + aList2.maxSize());
		
		double[] arr = new double[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (double)i;
		}
		System.out.println ("Testing Constructor 3");
		DoubleList aList3 = new DoubleList (arr);
		System.out.println ("size: " + aList3.size());
		System.out.println ("max size: " + aList3.maxSize());
		System.out.println ("List is: " + aList3+"\n");
		
		double[] arr2 = new double[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (double)i;
		}
		System.out.println ("Testing Remove Method");
		DoubleList aList4 = new DoubleList (arr2);
		double r;

		for (int i = 0; i < arr2.length; i++) {
			r = aList4.remove();
			System.out.println("Removed Value: "+r);
		}
		try {
		   aList4.remove();  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		System.out.println ("size: " + aList4.size());
		System.out.println ("max size: " + aList4.maxSize());
		System.out.println ("List is: " + aList4 + "\n");

		
		System.out.println ("Testing indexOf Method");
		System.out.println ("First occurence of 0.0 is " + aList3.indexOf(0.0));
		System.out.println ("First occurence of 2.0 is " + aList3.indexOf(2.0));
		System.out.println ("First occurence of 5.0 is " + aList3.indexOf(5.0));
		
		System.out.println ("\nList is: " + aList3);
		System.out.println ("Testing sum Method");
		System.out.println ("The sum of aList3 is " + aList3.sum());
		System.out.println ("The sum of aList4 is " + aList4.sum());

		
		System.out.println ("\nTesting mean Method");
		System.out.println ("The mean of aList3 is " + aList3.mean());
		System.out.println ("The mean of aList4 is ");
		try {
			aList4.mean();  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		
		System.out.println ("\nTesting maximum Method");
		System.out.println ("The maximum of aList3 is " + aList3.maximum());
		System.out.println ("The maximum of aList4 is ");
		try {
			aList4.maximum();  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		
		System.out.println ("\nTesting minimum Method");
		System.out.println ("The minimum of aList3 is " + aList3.minimum());
		System.out.println ("The minimum of aList4 is ");
		try {
			aList4.minimum();  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}

		System.out.println ("\nTesting get Method");
		System.out.println ("The value at index 1 is " + aList3.get(1));
		System.out.println ("The value at index 5 is ");
		try {
			aList3.get(5);  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}
		
		System.out.println ("\nTesting set Method");
		System.out.println ("Sets the value at index 0 to 1.0");
		aList3.set(0, 1.0);
		System.out.println ("List is: " + aList3+"\n");

		System.out.println ("Sets the value at index 6 to 6.0");
		try {
			aList3.set(6, 6.0);  // generates an Exception
		}
		catch (Exception e) {
		   System.out.println ("Error: " + e);
		}


	}
}
