//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	public String pythagCheck() {
		String out = "";
		for (int a = 1; a <= number; a++) {
			for (int b = 1; b <= number; b++) {
				for (int c = 1; c <= number; c++) {
					if (a*a + b*b == c*c) {
						if (((a%2 == 1) && (b%2 == 0) && (c%2 == 1)) || ((a%2 == 0) && (b%2 == 1) && (c%2 == 1))) {
							if (greatestCommonFactor(a, b, c) == 1) {
								out = out + a + ", " + b + ", " + c + "\n ";
							}
						}
					}
				}
			}
		}
		return out;
	}
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i <= a; i++) {
			if (a%i == 0 && b%i == 0 && c%i == 0) {
				if (i != 1) {
					return i;
				}
			}
		}

		return 1;
	}

	public String toString()
	{
		String output="";






		return pythagCheck();
	}
}