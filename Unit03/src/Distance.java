//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	Scanner keyboard = new Scanner(System.in);
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
		distance = 0.0;
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
		distance = 0.0;
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		
	}

	public void calcDistance()
	{
		distance = sqrt(pow(xOne - xTwo, 2) + pow(yOne - yTwo, 2));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "" + "distance == " + String.format("%.3f",  getDistance()) + "\n\n";
	}
}