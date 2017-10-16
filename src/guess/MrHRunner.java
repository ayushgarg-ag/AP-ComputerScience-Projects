package guess;

import java.util.Scanner;


public class MrHRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value ();
		System.out.println ("v1 is: " + v1);
		
		System.out.println ("Enter a number: ");
		Scanner rdr = new Scanner (System.in);
		int i = rdr.nextInt();
		Value v2 = new Value (i);
		System.out.println ("v2 is: " + v2);
		
		if (v2.compareTo(v1) == 0) {
			System.out.println ("Congratulations - you are right");
		}
		else if (v2.compareTo(v1) < 0) {
			System.out.println ("Too Low");
		}
		else if (v2.compareTo(v1) > 0) {
			System.out.println ("Too High");
		}
		else {
			System.out.println ("Uhh. This is not possible - how did you do that?");
		}
		rdr.close();
		
	}

}
