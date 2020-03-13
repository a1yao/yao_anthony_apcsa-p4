//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		String choice = "";
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Enter a word :: ");
			String word = keyboard.next();
			
			TriangleWord run = new TriangleWord();
			System.out.println(run.printTriangle(word));
			
			
			
			
			System.out.println("\nDo you want to enter more sample input? ");
			choice = keyboard.next();
		} while (choice.equals("Y") || choice.equals("y"));
	}
}