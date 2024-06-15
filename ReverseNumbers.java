package BasicPrograms;

import java.util.Scanner;

public class ReverseNumbers 
{
	public static void main(String[] args) 
	{
	
		//1.using algorithm
		System.out.println("enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		/*	int rev=0;
		while(n!=0)
		{
			rev=rev*10 + n%10;
			n=n/10;
		}
		System.out.println(rev);
	*/
		
		//2. using StringBuffer class
	/*	StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);
	*/
		
		//3. using StringBuilder Class
		StringBuilder sbl=new StringBuilder();
		sbl.append(n);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);
		sc.close();
	}
}
