//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> li = new ArrayList<Integer>();
    	for (int i = 0; i < m.length; i++) {
    		li.add(0);
    		for (int j = 0; j < m[i].length; j++) {
    			li.set(i, li.get(i) + m[i][j]);
    		}
    	}
		return li;
    }
}
