//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore()
	{
	}

	public void loadToys( String toys )
	{
		String[] splited = toys.split(" ");
		for (int i = 0; i < splited.length; i++) {
			for (int j = 0; j < toyList.size(); j++) {
				if (toyList.get(j).getName().equals(splited[i])) {
					toyList.get(j).setCount(toyList.get(j).getCount() + 1);
				}
				else {
					toyList.add(new Toy(splited[i], 1));
				}
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i < toyList.size(); i++) {
  			if ((toyList.get(i).getName()).equals(nm)){
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String ret = "";
		for (int i = 0; i < toyList.size(); i++) {
			ret = ret + toyList.get(i).toString() + "\n";
		}
		return ret;
	}
}