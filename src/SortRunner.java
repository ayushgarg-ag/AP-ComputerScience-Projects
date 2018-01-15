
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
	}

}
