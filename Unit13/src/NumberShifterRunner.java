//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] cases = {1, 10, 9, 2, 8, 2, 5, 6, 10, 7, 9, 8, 6, 7, 2, 7, 6, 10, 5, 3};
		int[] ret = NumberShifter.makeLucky7Array(cases);
		for (int item : ret) {
			System.out.print(item + " ");
		}
	}
}



