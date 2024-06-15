package Arrays;

import java.util.Scanner;

public class Exam3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Total Cost of the House ");
		int n=sc.nextInt();
		int construct=n*60/100;
		int design=n*20/100;
		int total=construct+design;
		System.out.println(total);
		if(total<=100)
			System.out.println("D");
		else if(total>100 &&  total<=1000)
			System.out.println("C");
		else if(total>1000 && total<=10000)
			System.out.println("B");
		else if(total>10000 && total<=100000)
			System.out.println("A");
		else
			System.out.println("S");
		sc.close();
	}
}
