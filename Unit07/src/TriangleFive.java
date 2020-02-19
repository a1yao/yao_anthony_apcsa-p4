//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('0');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		int nAmt = amount;
		int mAmt;
		char let = letter;
		String output="";
		for (int k = 0; k < amount; k++) {
			mAmt = amount - k;
			for (int j = 0; j < mAmt; j++) {
				nAmt = amount - j;
				for (int i = 0; i < nAmt; i++) {
					output = output + let;
				}
				if (let == 'z') {
					let = 'a';
				}
				else if (let == 'Z') {
					let = 'A';
				}
				else {
					let++;
				}
				
				output = output + " ";
			}
			let = letter;
			output = output + "\n";
			
		}
		return output;
	}
}