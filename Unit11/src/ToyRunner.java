//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{	
//		String choice = "";
//		ArrayList<Toy> toys = new ArrayList<Toy>();
//		do {
//			Scanner keyboard = new Scanner(System.in);
//			System.out.println("Enter a toy :: ");
//			String nm = keyboard.nextLine();
//			System.out.println("How many? :: ");
//			int cnt = keyboard.nextInt();
//			toys.add(new Toy(nm, cnt));
//			
//			for (int i = 0; i < toys.size(); i++) {
//				System.out.println(toys.get(i));
//			}
//			
//			System.out.println("Add more toys? :: ");
//			choice = keyboard.next();
//			
//		
//		} while (choice.equals("y") || choice.equals("Y"));
		
		
		ToyStore ts = new ToyStore();
		ts.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(ts);
		
	}
}