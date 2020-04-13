//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	setMat(size, str);
    }
    
    public void setMat(int size, String str) {
    	m = new String[size][size];
    	int index = 0;
    	for (int i = 0; i < size; i ++) {
    		for (int j = 0; j < size; j++) {
    			m[i][j] = str.substring(index, index + 1);
    			index++;
        	}
    	}

    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m.length; j++) {
    			if((checkRight(word, i, j)||checkLeft(word, i, j)||(checkUp(word, i, j)||checkDown(word, i, j)||checkDiagUpRight(word, i, j)||checkDiagUpLeft(word, i, j)||checkDiagDownLeft(word, i, j)||(checkDiagUpLeft(word, i, j))))){
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int index = 0; 
		for (int i = 0; i < w.length(); i++) {
			if ((r + i) >m.length - 1) {
				return false;
			}
			if (!(m[c][r + i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((r - i) < 0) {
				return false;
			}
			if (!(m[c][r - i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((c - i) < 0) {
				return false;
			}
			if(!(m[c - i][r].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((c + i) > m.length - 1) {
				return false;
			}
			if(!(m[c + i][r].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((c - i < 0)||(r + i > m.length - 1)){
				return false;
			}
			if(!(m[c - i][r + i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((r - i < 0)||(c - i > m.length - 1)){
				return false;
			}
			if(!(m[c - i][r - i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((r - i < 0)||(c + i > m.length - 1)){
				return false;
			}
			if(!(m[c + i][r - i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int index = 0;
		for (int i = 0; i < w.length(); i++) {
			if ((r + i < 0)||(c + i > m.length - 1)){
				return false;
			}
			if(!(m[c + i][r + i].equals(w.substring(index, index + 1)))){
				return false;
			}
			index++;
		}
		
		return true;
	}

    public String toString()
    {
    	String output = "";
    	int ind = 0;
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m.length; j++) {
    			output = output + m[i][j];
    			ind++;
    			if (ind == m.length) {
    				ind = 0;
    				output = output + "\n";
    			}
    		}
    	}
 		return output;
    }
}
