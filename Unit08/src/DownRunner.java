//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		int[] a1 = new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345};
		int[] a2 = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		int[] a3 = new int[] {10,20,30,40,50,-11818,40,30,20,10};
		int[] a4 = new int[] {32767};
		int[] a5 = new int[] {255, 255};
		int[] a6 = new int[] {9,10,-88,100,-555,1000};
		int[] a7 = new int[] {10,10,10,11,456};
		int[] a8 = new int[] {-111,1,2,3,9,11,20,30};
		int[] a9 = new int[] {9,8,7,6,5,4,3,2,0,-2,-989};
		int[] a10 = new int[] {12,15,18,21,23,1000};
		int[] a11 = new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		int[] a12 = new int[] {9,10,-8,10000,-5000,1000};
		RayDown run = new RayDown(a1);
		System.out.println(run);
		run.setArray(a2);
		System.out.println(run);
		run.setArray(a3);
		System.out.println(run);
		run.setArray(a4);
		System.out.println(run);
		run.setArray(a5);
		System.out.println(run);
		run.setArray(a6);
		System.out.println(run);
		run.setArray(a7);
		System.out.println(run);
		run.setArray(a8);
		System.out.println(run);
		run.setArray(a9);
		System.out.println(run);
		run.setArray(a10);
		System.out.println(run);
		run.setArray(a11);
		System.out.println(run);
		run.setArray(a12);
		System.out.println(run);
		
	}
}