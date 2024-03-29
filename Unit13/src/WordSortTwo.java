//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		setSort(sentence);
	}
	
	public void setSort(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString()
	{
		sort();
		String output="";
		for (String item : wordRay) {
			output = output + item + "\n";
		}
		return output+"\n\n";
	}
}