//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	public Discount() {
		
	}
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		double fbill = 0;
		if (bill > 2000) {
			fbill = bill*(0.85);
		}
		else {
			fbill = bill;
		}
		return fbill;
	}
}