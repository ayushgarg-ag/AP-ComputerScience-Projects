
public class SortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APArrayList<Integer> lst = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lst.add((int) (Math.random() * 1000));
		}
		System.out.println(lst);
		lst.selectionSort();
		System.out.println(lst);

		// Bubble Sort
		APArrayList<Integer> list = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 1000));
		}
		System.out.println(list);
		list.bubbleSort();
		System.out.println(list);

	}

}
