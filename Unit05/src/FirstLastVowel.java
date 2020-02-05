//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		return "add code here";
	}
   private char first, last;
   private String String;
   
   
  
   public FirstLastVowel() {
	   setString(null);
   }
   
   public FirstLastVowel(String s) {
	   setString(s);
   }
   
   public void setString(String s) {
	   String = s;
   }
   
   public void setChars(String s) {
	   first = s.charAt(0);
	   last = s.charAt(s.length());
   }
   
   public boolean isVowel() {
	   boolean boolb = false;
	   if (first == 'A'	|| first == 'E' || first == 'I' || first == 'O' || first == 'U' || first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){ 
		   boolb = true;
	   }
	   if (last == 'A'	|| last == 'E' || last == 'I' || last == 'O' || last == 'U' || last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u'){ 
		   boolb = true;
	   }
	   if (boolb) {
		   return true;
	   }
	   else {
		   return false;
	   }
   }
   public String toString() {
	   if (isVowel()) {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
   }
}