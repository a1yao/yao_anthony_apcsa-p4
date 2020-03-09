package Activity02;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
//		String[] ranks = {"jack", "queen", "king"};
//		String[] suits = {"blue", "red", };
//		int[] pointValues = {11, 12, 13};
//		Deck d = new Deck(ranks, suits, pointValues);
//		d.deal();
//		System.out.println(d);
//		
//		String[] ranks2 = {"1", "2", "3"};
//		String[] suits2 = {"H", "C", "S"};
//		int[] pointValues2 = {1, 2, 3};
//		Deck e = new Deck(ranks2, suits2, pointValues2);
//		System.out.println(e);
		
		String[] ranks3 = {"4", "5", "6"};
		String[] suits3 = {"H", "C", "S"};
		int[] pointValues3 = {4, 5, 6};
		Deck f = new Deck(ranks3, suits3, pointValues3);
		System.out.println(f);
		f.shuffle();
		System.out.println(f);
	}
}
