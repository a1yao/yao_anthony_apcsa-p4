//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	private String str;
	
	public CountPairs() {
		
	}
	public CountPairs(String s) {
		setPairs(s);
	}
	
	
	public void setPairs(String s) {
		str = s;
	}
	
	
	public int calcPairs() {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
	
	public String toString() {
		return "" + calcPairs();
	}
}