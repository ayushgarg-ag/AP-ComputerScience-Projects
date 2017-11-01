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
		
//		double[] arr2 = new double[5];
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = (double)i;
//		}
//		System.out.println ("Testing Remove Method");
//		DoubleList aList4 = new DoubleList (arr2);
//		double r;
//
//		for (int i = 0; i <= arr2.length; i++) {
//			r = aList4.remove();
//			System.out.println("Removed Value: "+r);
//		}
//		System.out.println ("size: " + aList4.size());
//		System.out.println ("max size: " + aList4.maxSize());
//		System.out.println ("List is: " + aList4 + "\n");

		
		System.out.println ("Testing indexOf Method");
		System.out.println ("First occurence of 0.0 is " + aList3.indexOf(0.0));
		System.out.println ("First occurence of 1.0 is " + aList3.indexOf(1.0));
		System.out.println ("First occurence of 2.0 is " + aList3.indexOf(2.0));
		
		
		
		
	}
}
