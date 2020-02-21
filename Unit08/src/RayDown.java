//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	private int[] array;
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public RayDown() {
		setArray(null);
	}
	public RayDown(int[] numArray){
		setArray(numArray);
	}
	public void setArray(int[] numArray) {
		array = numArray;
	}
	
	public static boolean go(int[] numArray)
	{
		if (numArray.length == 1) {
			return true;
		}
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] < numArray[i + 1] || numArray[i] == numArray[i + 1]) {
				return false;
			}
		}
		return true;
	}	
	public String toString() {
		return "" + go(array);
	}
}