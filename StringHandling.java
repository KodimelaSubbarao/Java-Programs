package String;

public class StringHandling 
{
	void meth1()
	{
		String s1="Kodimela Subbarao";
		String s2="Kodimela Subbarao";
		String ns1=new String("Kodimela Subbarao");
		String ns2=new String("Kodimela Subbarao");
		String s3="kodimela subbarao";
		String ns3=new String("kodimela subbarao");
		
		System.out.println("\n'==' operator comapre the address locations");
		System.out.println(s1==s2);
		System.out.println(ns1==ns2);
		System.out.println(s1==ns1);
		System.out.println(s1==s3);
		
		System.out.println("\nequals() it is comapre the content only and camelcase");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(ns1));
		System.out.println(ns1.equals(s1));
		System.out.println(ns1.equals(ns2));
		System.out.println(s1.equals(ns3));
		
		System.out.println("\nequalsIgnoreCase() it is comapre the content only and Ignore camelcase");
		System.out.println(s1.equalsIgnoreCase(ns2));
		System.out.println(s1.equalsIgnoreCase(ns3));
		System.out.println(ns1.equalsIgnoreCase(s3));
		
		System.out.println("\ntoUpperCase() it is convert the string lowercase to uppercae");
		System.out.println(s1.toUpperCase());
		System.out.println(ns3.toUpperCase());
		
		System.out.println("\ntoLowerCase() it is convert uppercase to lowercase");
		System.out.println(s1.toLowerCase());
		System.out.println(ns2.toLowerCase());
		
		System.out.println("\ncharAt() it is print the character based on index value ");
		System.out.println(s1.charAt(0));
		System.out.println(ns3.charAt(10));
		
		System.out.println("\ncodePointAt() it is generate the unique codepoint value for every character using index values");
		System.out.println(s1.codePointAt(3));
		System.out.println(s1.codePointAt(2));
		
		System.out.println("\ncodePointBefore() it is generate the unique code point value of before character using index values");
		System.out.println(s1.codePointBefore(3));
		System.out.println(s1.codePointBefore(10));
		
		System.out.println("\ncodePointCount() it is count the generated unique code points in index value ranges ");
		System.out.println(s3.codePointCount(1,10));
		System.out.println(ns2.codePointCount(5, 17));
		
		String a="Hii";
		System.out.println("\ncomapreTo() it is compare two strings based on unicode value of the characters");
		System.out.println("it is strings are equal names we will get Zero(0) otherwise you will get negative or positive values");
		System.out.println(a.compareTo(s1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(ns1.compareTo(s1));
		System.out.println(ns1.compareTo(ns2));
		System.out.println(ns1.compareTo(ns3));
	}
	public static void main(String[] args) 
	{
		StringHandling aobj=new StringHandling();
		aobj.meth1();
	}

}
