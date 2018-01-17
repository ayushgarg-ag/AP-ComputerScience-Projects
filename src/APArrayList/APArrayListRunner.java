package APArrayList;

public class APArrayListRunner {

	public static void main(String[] args) {

		APArrayList<Double> list = new APArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list.add(Math.random());
		}
		System.out.println(list);
		System.out.println("The max value is: " + list.max());

		APArrayList<Integer> lst = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lst.add((int) (Math.random() * 1000));
		}
		System.out.println(lst);
		lst.sort();
		System.out.println(lst);

		System.out.print("\nSelection Sort\n");
		APArrayList<Integer> lst2 = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lst2.add((int) (Math.random() * 1000));
		}
		System.out.println(lst2);
		lst2.selectionSort();
		System.out.println(lst2);

	}
}
