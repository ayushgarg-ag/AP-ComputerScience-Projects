package APArrayList;

public class SwapRunner {
	public static void main(String[] argv) {
		APArrayList<Integer> lst = new APArrayList<Integer>();
		for (int i = 5; i < 10; i++) {
			lst.add(i);
		}
		System.out.println(lst); // 5, 6, 7, 8, 9
		lst.swap(1, 4);
		System.out.println(lst); // 5, 9, 7, 8, 6
	}
}
