//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int[] Ray;
	public RaySumLast() {
		setArray(null);
	}
	public RaySumLast(int[] ray) {
		setArray(ray);
	}
	
	
	public void setArray(int[] ray) {
		Ray = ray;
	}
	public int sumArray(){
		int sum = 0;
		for (int i = 0; i < Ray.length; i++) {
			if (Ray[i] > Ray[Ray.length - 1]) {
				sum = sum + Ray[i];
			}
		}
		if (sum > 0) {
			return sum;
		}
		else {
			return -1;
		}
	}
	public String toString() {
		return "" + sumArray();
	}
}