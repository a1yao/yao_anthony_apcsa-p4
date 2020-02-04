//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static String check( double a, double b )
	{
		double ans = 0;
		if (a > b) {
			ans = a - b;
		}
		else if (b > a) {
			ans = b - a;
		}
		else {
			ans = a*b;
		}
		return String.format("%.1f", ans);
	}
}