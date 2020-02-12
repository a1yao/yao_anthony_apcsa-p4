//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(null, '0');
	}
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		
		String cleaned=sentence;
		String cleaned2 = "";
		int index = 0;
		int psn = 0;
		if (cleaned.indexOf(lookFor) <= 0) {
			return cleaned;
		}
		else {
			while (cleaned.indexOf(lookFor) >= 0) {
				psn = cleaned.indexOf(lookFor, index);
				cleaned = cleaned.substring(0, psn) + cleaned.substring(psn + 1, cleaned.length());
				index = psn + 1;
			}
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}