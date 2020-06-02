package flag;

public class Flag {
	public void printFlag (int size) {
		arrange(size);
	}
	public void printStars (int n) {
		if (n < 0) {
			System.out.print("*");
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			printStars(n-1);
		}
	}
	public void printStripes (int n) {
		if (n == 1) {
			return;
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.print("=");
			}
			System.out.println();
			printStripes(n-1);
		}
	}
	public void arrange (int n) {
		int i = n;
		int j = 0;
		for (int a = 0; a < n + 1; a++) {
			printStars(i);
			printStripes(j);
			i--;
			j++;
		}
	}
}
