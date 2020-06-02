package APArrayList;

public class RecSearchRunner {

	public static void main(String[] args) {
		System.out.println("n\trecSearch\trecBinSearch\tlinSearch\tbinSearch");
		
		for (int n = 100; n <= 1000; n += 100) {
			APArrayList<Double> lst = new APArrayList<Double>();
			double val = 0.0;
			for (int i = 0; i < n; i++) {
				val = (Math.random() * 1000);
				lst.add(val);
			}
			long startVal;
			long endVal;
			long recSearch = 0;
			long recBinSearch = 0;
			long linSearch = 0;
			long binSearch = 0;
			long total;

			lst.sort();
			for (int i = 0; i < n; i++) {
				val = lst.get(i);
				
				// Recursive Linear Search
				startVal = System.nanoTime();
				lst.recSearch(val);
				endVal = System.nanoTime();
				total = endVal - startVal;
				recSearch += total;

				// Recursive Binary Search
				startVal = System.nanoTime();
				lst.recBinSearch(val);
				endVal = System.nanoTime();
				total = endVal - startVal;
				recBinSearch += total;

				// Linear Search
				startVal = System.nanoTime();
				lst.linearSearch(val);
				endVal = System.nanoTime();
				total = endVal - startVal;
				linSearch += total;

				// Binary Search
				startVal = System.nanoTime();
				lst.binarySearch(val);
				endVal = System.nanoTime();
				total = endVal - startVal;
				binSearch += total;
			}
			
			recSearch /= n;
			recBinSearch /= n;
			linSearch /= n;
			binSearch /= n;
			System.out.println(n + "\t" + recSearch + "\t" + recBinSearch + "\t" + linSearch + "\t" + binSearch);
		}
	}
}
