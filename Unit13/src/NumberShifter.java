//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private static int[] l7;
	public static int[] makeLucky7Array( int[] array)
	{
		l7 = new int[array.length];
		shiftEm(array);
		return l7;
	}
	public static void shiftEm(int[] array)
	{
		int scount = 0;
		for (int s : array) {
			if (s == 7) {
				scount++;
			}
		}
		for (int i = 0; i < scount; i++) {
			l7[i] = 7;
		}
		int index = scount;
		for (int x : array) {
			if (x != 7) {
				l7[index] = x;
				index++;
			}
		}
	}
}