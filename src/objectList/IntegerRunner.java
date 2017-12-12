package objectList;

public class IntegerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectList<Integer> list = new ObjectList(20);
		
		for (int i = 0; i < list.maxSize(); i++) {
			int rand = (int)(Math.random() * 99) + 1;
			list.add(rand);
		}
		System.out.println(list);
		
		int n = 0;
//		for (ObjectList<Integer> o: list) {
//			if (o.get(n) % 2 == 0) {
//				list.remove(n);
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}

}