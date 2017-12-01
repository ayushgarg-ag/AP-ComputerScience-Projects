package timing;

public class LinearRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double time[] = new double[100];
		for (int n = 0; n < 100; n++) {
			long startTime = System.nanoTime();
			for (int i = 1; i <= n; i++) {
				System.out.println(i);
			}
			long endTime = System.nanoTime();
			time[n] = endTime - startTime;			
		}
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "\t" + time[i-1]);
		}
	}

}
