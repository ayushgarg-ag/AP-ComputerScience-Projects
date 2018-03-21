package APArrayList;

public class QuickSortRunner {
	public static void main(String[] args) {
		APArrayList<Double> list = new APArrayList<Double>();
		for (int i = 0; i < 25; i++) {
			list.add(Math.random());
		}
		System.out.println(list);
		list.simpleQuickSort();
		System.out.println(list);
	}
}
