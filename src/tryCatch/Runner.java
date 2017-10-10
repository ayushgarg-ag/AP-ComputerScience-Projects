package tryCatch;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int val;
		do {
			System.out.println("Enter an integer");
			try {
				val = reader.nextInt();
			} catch (Exception e) {
//				String wrong = reader.nextLine();
//				System.out.println("You were supposed to enter an integer! \nYou entered: " + wrong + "\n" + e);
				val = -1;
			}
		} while ((val < 0) || (val > 100));
		
		
	}
}
