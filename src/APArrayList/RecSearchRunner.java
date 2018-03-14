package APArrayList;

public class RecSearchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APArrayList<Double> lst = new APArrayList<Double> ();
		for (int i = 0; i < 100; i++) {
			lst.add(Math.random());
		}
			double val = lst.get(50);
			System.out.println (lst.recSearch(val));

	}

}
