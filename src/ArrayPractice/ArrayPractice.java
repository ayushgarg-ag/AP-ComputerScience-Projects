package ArrayPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [] school2 = new String [3];
		// school2[0] = "Peak";
		// school2[1] = "to";
		// school2[2] = "Peak";

		String[] school = { "Peak", "to", "Peak"};

//		for (int x = 0; x < school.length; x++) {
//			System.out.print(school[x] + " ");
//		}
		System.out.println(concat(school));
	}
	public static String concat(String[] arr) {
		String y = new String();
		for (int x = 0; x < arr.length; x++) {
			y += arr[x] + " ";
		}
		return y;
	}

}
