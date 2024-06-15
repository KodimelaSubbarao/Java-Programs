package String;
import java.util.Arrays;
import java.util.Scanner;

public class StringMethod 
{   
	   void meth1()
	   {
	       String s1="Java";
	       String s2=new String("Java");
	       String s3="Java";
	       String s4=new String("Java");
	       
	       // ---------equals()--------
	       
	       System.out.println(s1.equals(s2));
	       
	       System.out.println(s2.equals("java"));
	       System.out.println(s2.equalsIgnoreCase("java"));
	       
	       System.out.println(s3.equals(s1));
	       System.out.println("Java".equals("Java"));
	       System.out.println("Java".equals(new String("Java")));
	       System.out.println(s4.equals(s1));
	       System.out.println(new String("Java").equals(new String("java")));
	       System.out.println("------------------------------");
	       
	       // --------- == ----------
	       System.out.println(s1==s2);
	       System.out.println(s1==s3);
	       System.out.println(s2==s4);
	       System.out.println(s4=="Java");
	       System.out.println("Java"=="Java");        
	       System.out.println("Java"==new String("Java"));
	       System.out.println(new String("Java")==new String("Java"));
	       System.out.println(s2==new String("Java"));
	       System.out.println("Java"==s1);        
	   }
	   void meth2()
	   {
	       System.out.println("Implementing String Class Methods");
	       String s1="Java";
	       System.out.println("length() : "+s1.length());
	       System.out.println("concat() : "+s1.concat(" is awesome"));
	       System.out.println("s1 : "+s1);
	       System.out.println("length() : "+s1.concat(" is awesome").length());
	       System.out.println("charAt() : "+s1.charAt(0));
	       System.out.println("charAt() : "+s1.charAt("Spring".length()/2));
	       System.out.println("charAt() : "+s1.charAt(6/2));	     
	       Scanner sc=new Scanner(System.in);
//	       System.out.println("Please enter your gender : (M/F)");
//	       char gender=sc.next().charAt(0);
//	       switch(gender)
//	       {
//	           case 'f','F':
//	               System.out.println("user is FeMale");
//	               break;
//	           case 'm','M':
//	               System.out.println("user is Male");
//	               break;
//	           default:
//	               System.out.println("Invalid Input");                
//	       }
	       sc.close();
	       String s2="Java is awesome";
	       System.out.println("startsWith() : "+s2.startsWith(s1));
	       System.out.println("startsWith() : "+s2.startsWith(" Java"));
	       System.out.println("startsWith() : "+s2.startsWith("J"));
	       
	       System.out.println("toLowerCase() : "+s2.toLowerCase());
	       System.out.println("toUpperCase () :"+s2.toUpperCase());
	       System.out.println(s2);
	       
	       //--------substring()---------
	       System.out.println("substring() : "+s2.substring(8));
	       System.out.println("substring() : "+s2.substring(8,11));
	       System.out.println("substring() : "+s2.substring(3,9));
	       
	       String s3="Hello World";
	       System.out.println("replace() : "+s3.replace('o', 'O'));
	       
	       String s4=" I love Java ";
	       System.out.println(s4.length());
	       System.out.println("trim() : "+s4.trim().length());
	       
	       System.out.println("indexOf() : "+s3.indexOf('o'));
	       System.out.println("lastIndexOf() : "+s3.lastIndexOf('o'));
	       
	       String s5="ABCDEF";
	       byte arr[]=s5.getBytes();
	       System.out.println("\n"+s5);
	       System.out.println(Arrays.toString(arr));
	       for(byte x:arr)
	       {
	           System.out.print((char)x);
	       }
	   }
	   public static void main(String[] args)
	   {
		   StringMethod  aobj=new StringMethod ();    
	       //aobj.meth1();
	       //System.out.println("===============");
	       //aobj.meth2();
		   meth3();
	   }
	   static void meth3()
	   {
		   String s="Kodimela";
		   String s1="Kodimela";
		   System.out.println(s==s1);
		   s=s+"Subbarao";
		   System.out.println(s==s1);
		   String s2="KodimelaSubbarao";
		   System.out.println(s==s2);
	   }
	}



	/*
	equals():
	---------
	1) equals() in String class it has been Overridden
	2) equals() in String class is going to check the CONTENTS present inside the Strings
	3) If both the Strings are having same contents then equals() is going to return true

	==:
	------
	1) It is going to comapre the address locations of the Strings.
	2) If both the Strings are present in the same address locations then == operator
	is going to return true otherwise false.
	*/

