package Activity01;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card JH = new Card("J", "H", 11);
		Card NH = new Card("9", "H", 9);
		Card JH2 = new Card("J", "H", 11);
		System.out.println(JH);
		System.out.println(NH);
		System.out.println(JH.matches(JH2));
		
	}
}
