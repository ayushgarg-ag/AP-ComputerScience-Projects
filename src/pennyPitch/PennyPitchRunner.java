package pennyPitch;

import java.util.Scanner;

public class PennyPitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square[][] board = new Square[5][5];
		int total = 0;
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				if (r == 0 || r == 4 || c == 0 || c == 4) {
					board[r][c] = new Square(1);
					System.out.print(board[r][c].toString()+" ");
				} else if (r == 1 || r == 3 || c == 1 || c == 3) {
					board[r][c] = new Square(2);
					System.out.print(board[r][c].toString()+" ");
				} else {
					board[r][c] = new Square(3);
					System.out.print(board[r][c].toString()+" ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {

			Scanner reader = new Scanner(System.in);
			String str = reader.nextLine();

			int row = (int) (Math.random() * 5);
			int col = (int) (Math.random() * 5);
			int val = board[row][col].getScore();
			System.out.println("Row: " + row + " Col: " + col + " Score: " + val);
			if (board[row][col].isOccupied() == true) {
				val *= 2;
			}
			total += val;
			board[row][col].setOccupied(true);
			for (int r = 0; r < board.length; r++) {
				for (int c = 0; c < board[0].length; c++) {
					System.out.print(board[r][c]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("\nYour total score is " + total);
		if (total > 9) {
			System.out.println("Winner!");
		}
	}

}
