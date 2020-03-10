//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	private ArrayList<Integer> list;
	
	public ListOddToEven() {
		setList(null);
	}
	public ListOddToEven(ArrayList<Integer> li) {
		setList(li);
	}
	public void setList(ArrayList<Integer> li) {
		list = li;
	}
	
	
	public int getDist() {
		int dist = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2 == 1){
				for (int j = list.size() - 1; j > i; j--){
					if (list.get(j)%2 == 0) {
						return j - i;
					}
				}
			}
		}
		return -1;
	}
	public String toString() {
		return "" + getDist();
	}
}