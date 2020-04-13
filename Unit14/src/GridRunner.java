//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] x = {"a", "b", "c", "9", "x"};
		Grid test = new Grid(8, 8, x);
		System.out.println(test);
	}
}