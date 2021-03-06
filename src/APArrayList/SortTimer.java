package APArrayList;

public class SortTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\tSelection\tBubble\tInsertion\tCollections\tQuick\tinPlaceQuick\tMerge");
		for (int n = 1000; n <= 7000; n += 500) {
			APArrayList<Double> lists = new APArrayList<Double>();
			APArrayList<Double> listb = new APArrayList<Double>();
			APArrayList<Double> listi = new APArrayList<Double>();
			APArrayList<Double> listc = new APArrayList<Double>();
			APArrayList<Double> listq = new APArrayList<Double>();
			APArrayList<Double> listipq = new APArrayList<Double>();
			APArrayList<Double> listm = new APArrayList<Double>();
			
			for (int i = 0; i < n; i++) {
				Double val = Math.random();
				lists.add(val);
				listb.add(val);
				listi.add(val);
				listc.add(val);
				listq.add(val);
				listipq.add(val);
				listm.add(val);
			}

			long selStartTime = System.nanoTime();
			lists.selectionSort();
			long selEndTime = System.nanoTime();
			long selSortTime = selEndTime - selStartTime;
			lists.clear();
			
			long bubStartTime = System.nanoTime();
			listb.bubbleSort();
			long bubEndTime = System.nanoTime();
			long bubSortTime = bubEndTime - bubStartTime;
			listb.clear();
			
			long insStartTime = System.nanoTime();
			listi.insertionSort();
			long insEndTime = System.nanoTime();
			long insSortTime = insEndTime - insStartTime;
			listi.clear();
			
			long CollStartTime = System.nanoTime();
			listc.sort();
			long CollEndTime = System.nanoTime();
			long CollSortTime = CollEndTime - CollStartTime;
			listc.clear();
			
			long quickStartTime = System.nanoTime();
			listq.simpleQuickSort();
			long quickEndTime = System.nanoTime();
			long quickSortTime = quickEndTime - quickStartTime;
			listq.clear();
			
			long inPlaceQuickStartTime = System.nanoTime();
			listipq.inPlaceQuickSort();
			long inPlaceQuickEndTime = System.nanoTime();
			long inPlaceQuickSortTime = inPlaceQuickEndTime - inPlaceQuickStartTime;
			listipq.clear();
			
			long mergeStartTime = System.nanoTime();
			listm.mergeSort();
			long mergeEndTime = System.nanoTime();
			long mergeSortTime = mergeEndTime - mergeStartTime;
			listq.clear();
			
			
			System.out.println(n + "\t" + selSortTime + "\t" + bubSortTime + "\t" + insSortTime + "\t" + CollSortTime + "\t" + quickSortTime + "\t" + inPlaceQuickSortTime + "\t" + mergeSortTime);
		}
	}
}