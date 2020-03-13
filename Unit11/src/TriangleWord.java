//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printTriangle(String word)
	{
		String out = "";
		String add = "";
			for (int j = 0; j <= word.length(); j++) {
				for (int k = 0; k < j; k++) {
					out = out + word.substring(0, j);
				}
				out = out + "\n";
			}
		return out;
	}
}