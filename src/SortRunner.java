
public class SortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APArrayList<Integer> lstS = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lstS.add((int) (Math.random() * 1000));
		}
		// Selection Sort
		System.out.println("Selection Sort");
		System.out.println(lstS);
		lstS.selectionSort();
		System.out.println(lstS);

		// Bubble Sort
		System.out.println("\nBubble Sort");
		APArrayList<Integer> lstB = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lstB.add((int) (Math.random() * 1000));
		}
		System.out.println(lstB);
		lstB.bubbleSort();
		System.out.println(lstB);

		// Insertion Sort
		System.out.println("\nInsertion Sort");
		APArrayList<Integer> lstI = new APArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lstI.add((int) (Math.random() * 1000));
		}
		System.out.println(lstI);
		lstI.insertionSort();
		System.out.println(lstI);
		
		
		
		for (int n = 1000; n <= 7000; n+=500) {
			APArrayList<Double> lists = new APArrayList<Double>();
			APArrayList<Double> listb = new APArrayList<Double>();
			APArrayList<Double> listi = new APArrayList<Double>();
			APArrayList<Double> listc = new APArrayList<Double>();
			for (int i = 0; i < n; i++) {
				Double val = Math.random();
				lists.add(val);
				listb.add(val);
				listi.add(val);
				listc.add(val);
				
			}
			
			long selStartTime = System.nanoTime();			
			lists.selectionSort();
			long selEndTime = System.nanoTime();
			long selSortTime = selEndTime - selStartTime;	
			
			long bubStartTime = System.nanoTime();			
			listb.bubbleSort();
			long bubEndTime = System.nanoTime();
			long bubSortTime = bubEndTime - bubStartTime;	
			
			long insStartTime = System.nanoTime();			
			listi.insertionSort();
			long insEndTime = System.nanoTime();
			long insSortTime = insEndTime - insStartTime;	
			
			long CollStartTime = System.nanoTime();			
			listc.sort();
			long CollEndTime = System.nanoTime();
			long CollSortTime = CollEndTime - CollStartTime;	
			
			System.out.println(n+"\t"+selSortTime+"\t"+bubSortTime+"\t"+insSortTime+"\t"+CollSortTime);

		}
	}

}
