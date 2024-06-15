package String;

import java.util.Arrays;

public class StringClass 
{
	void stringComapre()
	{
		String s1="SA";
		String s2="SA";

		String s3=new String("SA");
		String s4=new String("SA");
		System.out.println(s1==s2); //"==" --> compare addresses only
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2)); //"equals()" --> compare text only
		System.out.println(s1.equals(s4));
	}
	void stringMethods()
	{
		//startsWith(), endsWith(), contains(), equals(), equalsIgnoreCase()
		String s1="Kodimela Subbarao";
		String s2="sa";
		String s3="     KSR      ";
		String s4="Hello^Every^One^Welcome^to^My^Program";
		String s5="";
		String s6=" ";
		String s="123";
		int i = 143;
		
		System.out.println("s1 value is : "+s1);
		System.out.println("s2 value is : "+s2);
		System.out.println("s3 value is : "+s3);
		System.out.println("s4 value is : "+s4);
		System.out.println("s5 value is : "+s5);
		System.out.println("s6 value is : "+s6);
		System.out.println("s value is : "+s);
		System.out.println("i value is : "+i+"\n");
		
		System.out.print("startsWith(''K'')  "+s1.startsWith("K")+"\t");
		System.out.println("\tstartsWith(''SA'')  "+s1.startsWith("SA"));
		System.out.print("endsWith(''rao'')  "+s1.endsWith("rao")+"\t");
		System.out.println("\tendsWith(''RAO'')   "+s1.endsWith("RAO"));
		System.out.print("contains(''rao'')  "+s1.contains("rao")+"\t");
		System.out.println("\tcontains(''RAO'')   "+s1.contains("RAO"));
		System.out.println("equals(''sa'')     "+s2.equals("sa"));
		System.out.println("equalsIgnoreCase(''SA'')  "+s2.equalsIgnoreCase("SA"));
		
		System.out.println("\n");
		//length(), trim(), toCharArray(), toLowerCase(), toUpperCase()
		System.out.println("s1.length() :  "+s1.length());
		System.out.println("s3.trim() :  "+s3.trim());
		System.out.println("s1.toCharArray() :  "+s1.toCharArray());
		System.out.println("s1.toUpperCase() :  "+s1.toUpperCase());
		System.out.println("s1.toLowerCase() :  "+s1.toLowerCase());
		
		System.out.println("\n");
		//indexOf(), lastIndexOf(), subString(), split(), charAt()
		System.out.println("s1.insexOf(''a'') :  "+s1.indexOf("a"));
		System.out.println("s1.insexOf(''z'') :  "+s1.indexOf("z"));
		System.out.println("s1.lastInsexOf(''a'') :  "+s1.lastIndexOf("a"));
		System.out.println("s1.lastInsexOf(''z'') :  "+s1.lastIndexOf("z"));
		System.out.println("s1.subString(5) :  "+s1.substring(5));
		System.out.println("s1.subString(9,17) :  "+s1.substring(9,17));
		System.out.println("s1.split(''  '')  :  "+s1.split(" "));
		System.out.println("Arrays.toString(s1.split(''  ''))  :  "+Arrays.toString(s1.split(" ")));
		System.out.println("Arrays.toString(s4.split(''\\^''))   :  "+Arrays.toString(s4.split("\\^")));
		System.out.println("s1.charAt(5) :  "+s1.charAt(5));
	
		System.out.println("\n");
		//replace(), replaceALl(), valueOf(), isEmpty(), isBlank()
		System.out.println("s1.replace(''Subbarao'',''Suresh'') :  "+s1.replace("Subbarao","Suresh"));
		System.out.println("s1.replaceAll(''a'',''x'') :  "+s1.replaceAll("a","x"));
		System.out.println("Convert string to integer==> Integer.valueOf(s) :  "+Integer.valueOf(s));
		System.out.println("Convert integer to string==> String.valueOf(i) :  "+String.valueOf(i));
		System.out.println("s5.isEmpty() :  "+s5.isEmpty());
		System.out.println("s5.isBlank() :  "+s5.isBlank());
		System.out.println("s6.isEmpty() :  "+s6.isEmpty());
		System.out.println("s6.isBlank() :  "+s6.isBlank());
	}
	public static void main(String[] args) 
	{
		StringClass obj=new StringClass();
		//obj.stringComapre();
		obj.stringMethods();
	}
}
