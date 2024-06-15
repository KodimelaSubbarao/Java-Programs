package BasicPrograms;


public class ReverseStrings 
{
	public static void main(String[] args) 
	{
		//1.using +(string concatenation operation)
	/*	String s="oarabbus";
		String rev="";
		int len=s.length(); //find the length of string
		for(int i=len-1;i>=0;i--)
			rev +=s.charAt(i);
		System.out.println(rev);
		
		//2.using Character Array
		char c[]=s.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev +=c[i];
		}
		System.out.println(rev);
	*/
		//3. using String Buffer Class
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.reverse());
	}
}
