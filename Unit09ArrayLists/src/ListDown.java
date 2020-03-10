//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	private ArrayList<Integer> list;
	public ListDown() {
		setList(null);
	}
	public ListDown(ArrayList<Integer> li) {
		setList(li);
	}
	
	public void setList(ArrayList<Integer> li) {
		list = li;
	}
	
	
	public boolean checkInc() {
		if (list.size() == 1) {
			return true;
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) <= list.get(i + 1)) {
				return false;
			}
		}
		return true;
	}
	public String toString() {
		return "" + checkInc();
	}
}