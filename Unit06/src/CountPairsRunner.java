//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		CountPairs test = new CountPairs("ddogccatppig");
		System.out.println(test);
		test.setPairs("dogcatpig");
		System.out.println(test);
		test.setPairs("xxyyzz");
		System.out.println(test);
		test.setPairs("a");
		System.out.println(test);
		test.setPairs("abc");
		System.out.println(test);
		test.setPairs("aabb");
		System.out.println(test);
		test.setPairs("dogcatpigaabbcc");
		System.out.println(test);
		test.setPairs("aabbccdogcatpig");
		System.out.println(test);
		test.setPairs("dogabbcccatpig");
		System.out.println(test);
		test.setPairs("aaaa");
		System.out.println(test);
		test.setPairs("AAAAAAAAA");
		System.out.println(test);
		
	}
}