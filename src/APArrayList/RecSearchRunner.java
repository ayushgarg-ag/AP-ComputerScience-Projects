package APArrayList;

import doubleList.DoubleList;

public class RecSearchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APArrayList<Double> lst = new APArrayList<Double>();
		for (int i = 0; i < 100; i++) {
			lst.add(Math.random());
		}
		double val = lst.get(50);
		System.out.println(lst.recSearch(val));

		lst.sort(); // must sort for binary sort to work
		val = lst.get(51);
		System.out.println(lst.recBinSearch(val));

		for (int n = 100; n <= 700; n += 100) {
			APArrayList<Double> list = new APArrayList<Double>();
			for (int i = 0; i < n; i++) {
				Double value = Math.random();
				list.add(value);
			}
			long totalRec;
			long totalRecBin;
			
			for (int i = 0; i < n; i++) {
				double v = list.get(i);
				long recStartTime = System.nanoTime();
				list.recSearch(v);
				long recEndTime = System.nanoTime();
				long recSortTime = selEndTime - selStartTime;
				totalRec += selSortTime;

				long recBinStartTime = System.nanoTime();
				list.recSearch(v);
				long recBinEndTime = System.nanoTime();
				long recBinSortTime = recBinEndTime - recBinStartTime;
				totalRecBin += recBinSortTime;

			}
			totalRec /= n;
			totalRecBin /= n;

			////////////////////////////////////////////////////////////////////
//			long time[] = new long[n];
//			list = new DoubleList(n);
//			int sum = 0;
//			for (int i = 0; i < n; i++) {
//				list.add(Math.random());
//			}
//
//			for (int i = 0; i < n; i++) {
//				long startTime = System.nanoTime();
//				list.indexOf(n);
//				long endTime = System.nanoTime();
//				long elapsed = endTime - startTime;
//				time[i] = elapsed;
//			}
//			for (int i = 0; i < time.length - 1; i++) {
//				sum += time[i];
//			}
//			double average = sum / n;
//			
//			list.sort();
//			DoubleList listB;
//			long timeB[] = new long[n];
//			listB = new DoubleList(n);
//			int sumB = 0;
//			for (int i = 0; i < n; i++) {
//				listB.add(Math.random());
//			}
//
//			for (int i = 0; i < n; i+=2) {
//				long startTimeB = System.nanoTime();
//				list.binarySearch(n);
//				long endTimeB = System.nanoTime();
//				long elapsedB = endTimeB - startTimeB;
//				timeB[i] = elapsedB;
//			}
//			for (int i = 0; i < time.length - 1; i++) {
//				sumB += timeB[i];
//			}
//
//			double averageB = sumB / n;
//			list.sort();
//
//			System.out.println(n + "\t" + average + "\t" + averageB);

			System.out.println(n + "\t" + totalRec + "\t" + totalRecBin + "\t" + insSortTime + "\t" + CollSortTime);
		}
	}

}
