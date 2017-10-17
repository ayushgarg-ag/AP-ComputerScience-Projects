package guess;

import java.util.Scanner;

public class GuessRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value val = new Value();
		Scanner reader = new Scanner(System.in);
		int guesses = 0;

		String response;
		Scanner reader2 = new Scanner(System.in);

		do {
			int num;
			do {
				System.out.println("Enter an integer");
				try {
					num = reader.nextInt();
					if (num > 100 || num < 0) {
						System.out.println("That is out of range!");
					}
				} catch (Exception e) {
					String wrong = reader.nextLine();
					System.out.println("You were supposed to enter an integer! \nYou entered: " + wrong + "\n" + e);
					num = -1;
				}
				guesses++;
			} while ((num < 0) || (num > 100));
			Value guess = new Value(num);

			while (val.compareTo(guess) != 0) {
				if (val.compareTo(guess) > 0) {
					System.out.println("The guessed number is too small.");
					guesses++;
				} else if (val.compareTo(guess) < 0) {
					System.out.println("The guessed number is too large.");
					guesses++;
				}
				do {
					System.out.println("Enter an integer");
					try {
						num = reader.nextInt();

					} catch (Exception e) {
						String wrong = reader.nextLine();
						System.out.println("You were supposed to enter an integer! \nYou entered: " + wrong + "\n" + e);
						num = -1;
					}
				} while ((num < 0) || (num > 100));
				guess = new Value(num);

			}

			if (val.equals(guess)) {
				System.out.println("Correct!");
				guesses++;
			}

			System.out.println("It took you " + guesses + " turns.");

			System.out.println("Do you want to play again?");
			response = reader2.next();
		}

		while (response.equals("yes"));
	}
}
