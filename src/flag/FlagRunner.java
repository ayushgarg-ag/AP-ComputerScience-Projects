package flag;

public class FlagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFlag(4);
	}

	public static void printFlag (int size) {
		arrange(size);
	}
	public static void printStars (int n) {
//		if (n == 1) {
//			System.out.print("*");
//		}
//		else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
//		}
//		System.out.println();
//		printStars(n-1);
	}
	public static void printStripes (int n) {
//		if (n == 1) {
//			System.out.print("=");
//		}
//		else {
			for (int i = 0; i < n; i++) {
				System.out.print("=");
			}
//		}
//		System.out.println();
//		printStripes(n-1);
	}
	public static void arrange (int n) {
		int i = 0;
		int j = n;
		for (int a = 0; a < n + 1; a++) {
			printStars(i);
			printStripes(j);
			i++;
			j--;
			System.out.println();
		}
	}
}
