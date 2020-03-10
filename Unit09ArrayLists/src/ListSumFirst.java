//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	private ArrayList<Integer> list;
	
	public ListSumFirst() {
		setList(null);
	}
	public ListSumFirst(ArrayList<Integer> l){
		setList(l);
	}
	
	
	public void setList(ArrayList<Integer> l) {
		list = l;
	}
	
	public int getSum() {
		int sum = 0;
		if (list.size() == 0 || list.size() == 1) {
			return -1;
		}
		int first = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > first) {
				sum = sum + list.get(i);
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
	public String toString() {
		return "" + getSum();
	}
}