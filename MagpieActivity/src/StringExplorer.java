/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		// Demonstrate the indexOf method.
		int pos = sample.indexOf("slow");
		if (pos != -1) {
			System.out.println("slow is found at position " + pos);
		}
		else {
			System.out.println("slow is not found");
		}
		//  Try other methods here:
		int index = 0;
		int count = 0;
		while (index < sample.length()) {
			int position1 = sample.indexOf("the", index);
			if (position1 >= 0) {
				count++;
			}
			index = position1;
			System.out.println(count);
		}
		
	}

}
