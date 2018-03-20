package APArrayList;

public class QuickSortRunner {
	public static void main(String[] args) {
		APArrayList<Integer> list = new APArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			list.add((int) (Math.random() * 25));
		}
		System.out.println(list);
		list.simpleQuickSort();
		System.out.println(list);
	}
}
