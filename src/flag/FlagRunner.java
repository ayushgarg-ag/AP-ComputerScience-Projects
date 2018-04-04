package flag;

public class FlagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFlag(4);
	}

	public static void printFlag(int size) {
//		line(size);
	}

	public static void printStars(int n) {
		if (n == 0) {
			return;
		}
		System.out.print("*");
		printStars(n - 1);
	}

	public static void printStripes(int n) {
		if (n == 0) {
			return;
		}
		System.out.print("*");
		printStars(n - 1);
	}

	public static void line(int stripes, int stars) {
		if (stripes < 0) {
			return;
		}
		printStars(stars);
		printStripes(stripes);
		line(stripes + 1, stars - 1);
	}
}
