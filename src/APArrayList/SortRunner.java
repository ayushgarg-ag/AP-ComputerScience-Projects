package APArrayList;

public class SortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APArrayList<Integer> lstS = new APArrayList<Integer>();
		APArrayList<Integer> lstB = new APArrayList<Integer>();
		APArrayList<Integer> lstI = new APArrayList<Integer>();
		APArrayList<Integer> lstM = new APArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			lstS.add((int) (Math.random() * 1000));
			lstB.add((int) (Math.random() * 1000));
			lstI.add((int) (Math.random() * 1000));
			lstM.add((int) (Math.random() * 1000));			
			
		}
		// Selection Sort
		System.out.println("Selection Sort");
		System.out.println(lstS);
		lstS.selectionSort();
		System.out.println(lstS);

		// Bubble Sort
		System.out.println("\nBubble Sort");
		System.out.println(lstB);
		lstB.bubbleSort();
		System.out.println(lstB);

		// Insertion Sort
		System.out.println("\nInsertion Sort");
		System.out.println(lstI);
		lstI.insertionSort();
		System.out.println(lstI);
		
		// Merge Sort
		System.out.println("\nMerge Sort");
		System.out.println(lstM);
		lstM.mergeSort();
		System.out.println(lstM);
		
		

	}

}
