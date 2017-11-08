package pennyPitch;

public class Square {
	private int score;
	private boolean occupied;
	
	public Square(int s) {
		score = s;
		occupied = false;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	
	public String toString() {
		if (occupied == false) {
			return "" + score;
		}
		else {
			return "P";
		}
	}
	
}
