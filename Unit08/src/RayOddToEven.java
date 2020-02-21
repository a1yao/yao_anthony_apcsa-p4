//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] Ray;
	public RayOddToEven() {
		setArray(null);
	}
	public RayOddToEven(int[] ray) {
		setArray(ray);
	}
	
	
	public void setArray(int[] ray) {
		Ray = ray;
	}
	public static int go(int[] ray)
	{
		for (int i = 0; i < ray.length; i++) {
			if (ray[i]%2 == 1) {
				for (int j = i; j < ray.length; j++) {
					if (ray[j]%2 == 0) {
						return j - i;
					}
				}
			}
		}
		return -1;
	}
	public String toString() {
		return "" + go(Ray);
	}
}