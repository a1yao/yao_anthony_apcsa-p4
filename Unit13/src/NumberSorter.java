//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	
	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number = number/10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int index = 0;
		int num = number;
		int[] uns = new int[getNumDigits(number)];
		int[] sorted = new int[getNumDigits(number)];
		while (num > 0) {
			uns[index] = num%10;
			num = num/10;
			index++;
		}
		Arrays.sort(uns);
		sorted = uns;
		return sorted;
	}
}