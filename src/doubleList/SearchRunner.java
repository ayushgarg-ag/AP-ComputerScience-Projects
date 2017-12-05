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

		for (int n = 1000; n < 10000; n+=1000) {
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
			list.sort();
			
//			long timeB = 0;
//			DoubleList list2 = new DoubleList(n);
//			for (int i = 0; i < list2.size() - 1; i++) {
//				list2.add(Math.random());
//			}
//			for (int i = 0; i < list2.size() - 1; i++) {
//				long startTime = System.nanoTime();
//				list2.indexOf(n);
//				long endTime = System.nanoTime();
//				timeB = endTime - startTime;		
//			}
//			double averageB = timeB / n;
			System.out.println(n + "\t" + average + "\t");
//		}

//		for (int n = 1000; n < 10000; n+=1000) {
//			DoubleList list2 = new DoubleList(n);
//			for (int i = 0; i < list2.size() - 1; i++) {
//				long startTime = System.nanoTime();
//				list.indexOf(n);
//				long endTime = System.nanoTime();
//				time = endTime - startTime;		
//			}
//			double average = time / n;
//		}
		
	}
	}
}
