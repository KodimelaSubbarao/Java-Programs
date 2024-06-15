package String;

public class StringQuestions 
{
//	Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//	helloName("Bob") ? "Hello Bob!"
	public static String helloName(String name)
	{
		//return "Hello "+name+"!";
		return "Hello ".concat(name).concat("!");
		
	}
	
//  Given two strings, a and b, return the result of putting them together in the order ab-ba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//	makeAbba("Hi", "Bye") ? "HiByeByeHi"
	public static String makeAbba(String a, String b)
	{
	   // return a+b+b+a;
	    return a.concat(b).concat(b).concat(a);
	}
	
// 	Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
// 	makeOutWord("<<>>", "Yay") ? "<<Yay>>"
	public static String makeOutWord(String out, String word)
	{
		return out.substring(0,2)+word+out.substring(2);
	}
	
//	Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//	extraEnd("Hello") ? "lololo"
	public static String extraEnd(String str)
	{
	    return ""+str.charAt(str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2)+str.charAt(str.length()-1);
		//return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
	}
	
//	Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//	firstTwo("Hello") ? "He"
	public static String firstTwo(String str)
	{
		if(str.length()>=2)
			return str.substring(0,2);
		else
			return "Please enter more than one charcters only";
	}

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//	firstHalf("WooHoo") ? "Woo"
	public static String firstHalf(String str)
	{
	   if(str.length()%2==0)
		   return str.substring(0,str.length()/2);
	   else
		   return "String Length Must be Even only...!";
	}
	
//	Given a string, return a string where for every char in the original, there are two chars.
//  doubleChar("The") ? "TThhee"
	public static String doubleChar(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			s=s+str.charAt(i)+str.charAt(i);
		}
		return s;
	}

//	Given String Palindrome or Not
	public static void meth1()
	{
		String s="Subbarao";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r+=s.charAt(i);
		}
		System.out.println(s);
		System.out.println(r);
		if(s.equalsIgnoreCase(r))
			System.out.println("Palidrome");
		else
			System.out.println("Not Palidrome");
	}

//	Given String Palindrome or Not
	static void meth2()
	{
		int num=121;
		int num1=121;
		System.out.println(num);
		int r=0;
		for(int i=1;i<=3;i++ )
		{
			r=r*10+num%10;
			num=num/10;
		}
		System.out.println(r);
		
		if(num1==r)
			System.out.println("Palidrome");
		else
			System.out.println("Not Palidrome");
		
	}
	public static void main(String[] args) 
	{
//		String r=helloName("Bob");
//		String r=makeAbba("Hi","Bye");
//		String r=makeOutWord("<<>>","KSR");
//		String r=extraEnd("Subbarao");
//		String r=firstTwo("S");
//		String r=firstHalf("WooHoo");
//		String r=doubleChar("SA");
//		System.out.println(r);
		//meth1();
		meth2();
	}
}
