package APArrayList;
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

	public void selectionSort() {
		for (int i = 0; i < this.size(); i++) {
			// find position of smallest num
			int minIndex = i;
			E min = this.get(i);
			for (int j = i; j < this.size(); j++) {
				if (min.compareTo(this.get(j)) > 0) {
					minIndex = j;
					min = this.get(j);

				}
			}
			this.swap(i, minIndex);
		}
	}

	public void bubbleSort() {
		int swaps = 0;
		for (int k = 0; k < this.size() - 1; k++) {
			for (int j = 0; j < this.size() - k - 1; j++) {
				if (this.get(j).compareTo(this.get(j + 1)) > 0) {
					this.swap(j, j + 1);
					swaps++;
				}
			}
			if (swaps == 0) {
				return;
			}
			swaps = 0;
		}
	}

	public void insertionSort() {
		for (int k = 1; k < this.size(); k++) {
			E val = this.get(k);
//			int j = k - 1;
			// while (j >= 0 && val.compareTo(this.get(j)) < 0) {
			// this.set(j+1, this.get(j));
			// j--;
			// }
//			boolean stillLooking = true;
			int j;
			for (j = k-1; j >= 0 && val.compareTo(this.get(j)) < 0; j--) {
				this.set(j + 1, this.get(j));
			}
			this.set(j + 1, val);
			
//			while ((j >= 0) && (stillLooking == true)) {
//				if (val.compareTo(this.get(j)) < 0) {
//					this.set(j + 1, this.get(j));
//					j--;
//				} else {
//					stillLooking = false;
//				}
//				this.set(j + 1, val);
//			}
		}
	}
}
