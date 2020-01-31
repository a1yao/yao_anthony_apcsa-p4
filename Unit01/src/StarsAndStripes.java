//© A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   System.out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n\n");
   }
   
   public void printASmallBox()
   {
	   System.out.println("xxx");
	   System.out.println("xxx");
	   System.out.println("xxx");
   }
 
   public void printABigBox()
   {
	   int i = 0;
	   while (i < 30) {
		   System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		   i = i + 1;
	   }
   }   
   public void printFlag() {
	   System.out.println("*****-----------");
	   System.out.println("*****-----------");
	   System.out.println("*****-----------");
	   System.out.println("*****-----------");
	   System.out.println("----------------");
	   System.out.println("----------------");
	   System.out.println("----------------");
	 
	   
   }
}