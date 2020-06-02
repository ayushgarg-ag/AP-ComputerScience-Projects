package APArrayList;

import java.util.Collections;

public class MergeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APArrayList<Integer> lst1 = new APArrayList<Integer>();
		APArrayList<Integer> lst2 = new APArrayList<Integer>();

		Collections.addAll(lst1, 1, 3, 5, 7);
		Collections.addAll(lst2, 2, 4, 6, 8);
		System.out.println(lst1);
		System.out.println(lst2);

		APArrayList<Integer> merged = new APArrayList<Integer>();
		merged.merge(lst1, lst2);
		System.out.println(merged);

		merged.merge(lst2, lst1); // repeat in reverse order
		System.out.println(merged); // should be the same

	}

}
