import java.util.Scanner;
class  ReverseOfString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		StringBuffer sb=new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			sb.append(str.charAt(i));
		}
		StringBuffer sb1=new StringBuffer(str);
		sb1.reverse();
		System.out.println(rev+" \n"+sb.toString());
		System.out.println(sb1.toString());
	}
}
