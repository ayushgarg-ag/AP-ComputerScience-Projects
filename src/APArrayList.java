import java.util.ArrayList;
import java.util.Collections;

public class APArrayList<E extends Comparable<E>> extends ArrayList<E> {
	public E max() {
		E max = this.get(0);
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).compareTo(max) > 0) {
				max = this.get(i);
			}
		}
		return max;
	}

	public void sort() {
		Collections.sort(this);
	}

	public void swap(int index1, int index2) {
		E val1 = this.get(index1);
		E val2 = this.get(index2);
		this.set(index1, val2);
		this.set(index2, val1);
	}

	// public E min () {
	// E min = this.get(0);
	// int minIndex = 0;
	// for (int i = 0; i < this.size() - 1; i++) {
	// if (min.compareTo(this.get(i)) > 0) {
	// minIndex = i;
	// }
	// return min;
	// }
	// }

	public void selectionSort() {
		// implement a selectionSort method that modifies "this"

		for (int i = 0; i < this.size() - 1; i++) {
//			E min = this.get(i);
			// find position of smallest num between (i + 1)th element and last element
			int minIndex = i;
			E min = this.get(minIndex);
			for (int j = i; i < this.size() - 1; j++) {
				if ((this.get(i)).compareTo(min) < 0) {
					minIndex = j;

				}

			}
			this.swap(i, minIndex);
		}
	}
}
