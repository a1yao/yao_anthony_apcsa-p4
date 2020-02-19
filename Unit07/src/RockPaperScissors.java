//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
		setPlayers('0');
	}

	public RockPaperScissors(char player)
	{
		setPlayers(player);
	}

	public void setPlayers(char player)
	{
		playChoice = player;
		int rNum = (int)(Math.random()*(3));
		if (rNum == 0) {
			compChoice = 'R';
		}
		else if (rNum == 1) {
			compChoice = 'P';
		}
		else {
			compChoice = 'S';
		}
	}

	public String determineWinner()
	{
		String rock = "<<Rock Breaks Scissors>>!";
		String paper = "<<Paper Covers Rock>>!";
		String scissors = "<<Scissors Cuts Paper>>!";
		String winner="";
		if ((playChoice == 'R')&&(compChoice =='S')) {
			winner = "!Player wins " + rock;
		}
		else if ((playChoice == 'P')&&(compChoice == 'R')) {
			winner = "!Player wins " + paper;
		}
		else if ((playChoice == 'S')&&(compChoice == 'P')) {
			winner = "!Player wins " + scissors;
		}
		else if ((playChoice == 'R')&&(compChoice == 'P')) {
			winner = "!Computer wins " + paper;
		}
		else if ((playChoice == 'P')&&(compChoice == 'S')) {
			winner = "!Computer wins " + scissors;
		}
		else if ((playChoice == 'S')&&(compChoice == 'R')) {
			winner = "!Computer wins " + rock;
		}
//		else {
//			winner = "!Draw Game!";
//		}
		return winner;
	}

	public String toString()
	{
		String output= "player had " + playChoice + " \n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}