//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		RockPaperScissors test = new RockPaperScissors();
		
		//add in a do while loop after you get the basics up and running
		
			char player = '0';
			char yn = '0';
			do {
				out.print("type in your prompt [R,P,S] :: ");
				
				//read in the player value
				response = keyboard.next().charAt(0);
				RockPaperScissors game = new RockPaperScissors(response);		
				System.out.println(game);
				System.out.println("Do you want to play again?");
				yn = keyboard.next().charAt(0);
			}while (!(yn == 'n'));
	}
}



