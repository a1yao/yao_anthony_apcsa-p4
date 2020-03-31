//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num, den, nnum, nden;
	//write two constructors
	
	public Rational () {
		setRational(1, 1);
	}
	
	public Rational (int num1, int den1) {
		setRational(num1, den1);
	}


	//write a setRational method
	
	public void setRational (int num1, int den1) {
		setNum(num1);
		setDen(den1);
	}

	//write  a set method for numerator and denominator
	
	public void setNum (int num1) {
		num = num1;
	}
	public void setDen (int den1) {
		den = den1;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int num2 = other.getNum();
		int den2 = other.getDen();
		
		nnum = num*den2 + num2*den;
		nden = den*den2;
		


		reduce();
	}

	private void reduce()
	{
		int min = Math.min(nnum,  nden);
		while (min > 0) {
			if(nnum%min == 0 && nden%min == 0) {
				num = nnum/min;
				den = nden/min;
				min = 0;
			}
			min = min - 1;
		}


	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		Rational test = new Rational(num, den);
		return test;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNum () {
		return num;
	}
	
	public int getDen() {
		return den;
	}
	
	public boolean equals(Rational obj)
	{
		if ((double)obj.getNum()/(double)obj.getDen() == (double)num/(double)den) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		if ((double)other.getNum()/(double)other.getDen() < (double)num/(double)den) {
			return 1;
		}
		
		if ((double)other.getNum()/(double)other.getDen() == (double)num/(double)den) {
			return 1;
		}


		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
	
}