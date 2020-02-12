//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect () {
	   setNumber(0);
   }
   public Perfect (int x) {
	   setNumber(x);
   }

	//add a set method
   public void setNumber(int x) {
	   number = x;
   }
	public boolean isPerfect()
	{
		int sdiv = 0;
		for (int i = 1; i < number; i++) {
			if (number%i == 0) {
				sdiv = sdiv + i;
			}
		}
		if (sdiv == number) {
			return true;
		}
		else {
			return false;
		}
	}

	//add a toString
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
	}
	
}