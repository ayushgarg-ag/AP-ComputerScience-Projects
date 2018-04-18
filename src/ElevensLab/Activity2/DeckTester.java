package ElevensLab.Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args	 is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Spades", "Diamonds"};
		int[] value1 = {11, 12, 13};
	    Deck deck1 = new Deck(rank1, suit1, value1);
        System.out.println("deck1: " + deck1);
	    System.out.println("Deck1 size should be 9: " + deck1.size());
	    System.out.println("Deck1 should not be empty: " + !deck1.isEmpty());
	    System.out.println("Deck1 dealt card is: " + deck1.deal());
	    
	    String[] rank2 = {"A", "2", "10", "Queen", "King"};
	    String[] suit2 = {"Clubs", "Spades", "Diamonds"};
	    int[] value2 = {1, 2, 10, 12, 13};
	    Deck deck2 = new Deck(rank2, suit2, value2);
        System.out.println("deck2: " + deck2);
	    System.out.println("Deck2 dealt card is: " + deck2.deal());
	    System.out.println("Deck2 should not be empty: " + !deck2.isEmpty());
	    System.out.println("Deck2 size should be 14: " + deck2.size());
	    
	    String[] rank3 = {"1", "3", "6", "9", "Queen", "King"};
	    String[] suit3 = {"Diamonds"};
	    int[] value3 = {1, 3, 6, 9, 12, 13};
	    Deck deck3 = new Deck(rank3, suit3, value3);
        System.out.println("deck3: " + deck3);
	    System.out.println("Deck3 dealt card 1 is: " + deck3.deal());
	    System.out.println("Deck3 dealt card 2 is: " + deck3.deal());
	    System.out.println("Deck3 dealt card 3 is: " + deck3.deal());
	    System.out.println("Deck3 size should be 3: " + deck3.size());
	    System.out.println("Deck3 should not be empty: " + !deck3.isEmpty());
	}
}