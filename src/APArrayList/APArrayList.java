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
			// int j = k - 1;
			// while (j >= 0 && val.compareTo(this.get(j)) < 0) {
			// this.set(j+1, this.get(j));
			// j--;
			// }
			// boolean stillLooking = true;
			int j;
			for (j = k - 1; j >= 0 && val.compareTo(this.get(j)) < 0; j--) {
				this.set(j + 1, this.get(j));
			}
			this.set(j + 1, val);

			// while ((j >= 0) && (stillLooking == true)) {
			// if (val.compareTo(this.get(j)) < 0) {
			// this.set(j + 1, this.get(j));
			// j--;
			// } else {
			// stillLooking = false;
			// }
			// this.set(j + 1, val);
			// }
		}
	}

	public int linearSearch(E item) {
		for (int i = 0; i < this.size(); i++) {
			if ((this.get(i)).equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public int recSearch(E item) {
		return recSearch(item, 0);
	}

	private int recSearch(E item, int start) {
		if (this.size() <= start) {
			return -1;
		}
		if ((this.get(start)).equals(item)) {
			return start;
		}
		return recSearch(item, start + 1);
	}

	public int recBinSearch(E item) {
		return recBinSearch(item, 0, size() - 1);
	}

	private int recBinSearch(E item, int start, int end) {
		// perform recursive binary search
		// base case 1: item found at midpoint: return midpoint
		int midpoint = (start + end) / 2;
		E midVal = this.get(midpoint);
		if (item.equals(midVal)) {
			return midpoint;
		}
		// base case 2: not found (start and end are "too close" to partition): return
		// -1
		if (start > end) {
			return -1;
		}
		// recursive case 1: item is between start and midpoint:
		if (item.compareTo(midVal) < 0) {
			return recBinSearch(item, start, midpoint - 1);
		}
		// recursive case 2: item is between midpoint and end:
		else {
			return recBinSearch(item, midpoint + 1, end);
		}
	}

	public int binarySearch(E item) {
		int left = 0;
		int right = size() - 1;
		int position = -1;
		while (left <= right) {
			int midpoint = (left + right) / 2;
			if (get(midpoint).compareTo(item) == 0) {
				return midpoint;
			} else if (get(midpoint).compareTo(item) < 0) {
				left = midpoint + 1;
			} else if (get(midpoint).compareTo(item) > 0) {
				right = midpoint - 1;
			}
		}
		return position;
	}

	public void simpleQuickSort() {
		if (this.size() == 0 || this.size() == 1) {
			return;
		}
		E pivot = this.get(this.size() - 1);
		this.remove(this.size() - 1);
		APArrayList<E> small = new APArrayList<E>();
		APArrayList<E> large = new APArrayList<E>();
		for (E item : this) {
			if (pivot.compareTo(item) > 0) {
				small.add(item);
			} else {
				large.add(item);
			}
		}
		this.clear();
		small.simpleQuickSort();
		large.simpleQuickSort();
		this.addAll(small);
		this.add(pivot);
		this.addAll(large);
	}

	public void inPlaceQuickSort() {
		inPlaceQuickSort(0, this.size() - 1);
	}

	public void inPlaceQuickSort(int left, int right) {
		// sort just the portion from left to right
		if (left >= right) {
			return;
		}
		int i = left;
		int j = right;
		E pivot = this.get((left + right) / 2);

		while (i < j) {
			while (this.get(i).compareTo(pivot) < 0) {
				i++;
			}
			while (pivot.compareTo(this.get(j)) < 0) {
				j--;
			}
			if (i <= j) {
				E temp = this.get(i);
				this.set(i, this.get(j));
				this.set(j, temp);
				i++;
				j--;
			}
		}
		inPlaceQuickSort(left, j);
		inPlaceQuickSort(i, right);
	}

	public void merge(APArrayList<E> part1, APArrayList<E> part2) {
		this.clear();
		int i = 0;
		int j = 0;
		while (i < part1.size() && j < part2.size()) {
			if (part1.get(i).compareTo(part2.get(j)) < 0) {
				this.add(part1.get(i));
				i++;
			}
			else {
				this.add(part2.get(j));
				j++;
			}
		}
		if (part1.size() > i) {
			while (i < part1.size()) {
				this.add(part1.get(i));
				i++;
			}
		}
		else if (j < part2.size()) {
			while (j < part2.size()) {
				this.add(part2.get(j));
				j++;
			}
		}
	}
	
	public void mergeSort () {
//		if (this.size() <= 1) {
//			return;
//		}
//		int middle = this.size() / 2;
//		for (int i = 0; i < middle; i++) {
//			part1.
//		}
	}

}
