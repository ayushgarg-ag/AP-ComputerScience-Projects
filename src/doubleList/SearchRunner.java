package doubleList;

public class SearchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoubleList lst = new DoubleList();
		for (int i = 0; i < 10; i++) {
			lst.add(Math.floor(Math.random() * 1000.));
		}
		System.out.println(lst);
		double val = lst.get(0);
		lst.sort();
		System.out.println(lst);
		int loc1 = lst.indexOf(val);
		System.out.println("item " + val + " is located at position: " + loc1 + " (linear)");
		int loc2 = lst.binarySearch(val);
		System.out.println("item " + val + " is located at position: " + loc2 + " (binary)");

		DoubleList list;

		for (int n = 1000; n < 10000; n += 1000) {
			long time[] = new long[n];
			list = new DoubleList(n);
			int sum = 0;
			for (int i = 0; i < n; i++) {
				list.add(Math.random());
			}

			for (int i = 0; i < n; i++) {
				long startTime = System.nanoTime();
				list.indexOf(n);
				long endTime = System.nanoTime();
				long elapsed = endTime - startTime;
				time[i] = elapsed;
			}
			for (int i = 0; i < time.length - 1; i++) {
				sum += time[i];
			}
			double average = sum / n;
			
			/////////////////////////////
			list.sort();
			DoubleList listB;
			long timeB[] = new long[n];
			listB = new DoubleList(n);
			int sumB = 0;
			for (int i = 0; i < n; i++) {
				listB.add(Math.random());
			}

			for (int i = 0; i < n; i+=2) {
				long startTimeB = System.nanoTime();
				list.binarySearch(n);
				long endTimeB = System.nanoTime();
				long elapsedB = endTimeB - startTimeB;
				timeB[i] = elapsedB;
			}
			for (int i = 0; i < time.length - 1; i++) {
				sumB += timeB[i];
			}

			double averageB = sumB / n;
			list.sort();

			System.out.println(n + "\t" + average + "\t" + averageB);

		}
	}
}
