package com.sa.numbers;

public class QuadrantInCo_Ordinate 
{
	public static void main(String[] args) 
	{
		int x=10,y=-20;
		
		if(x>0 && y>0)
			System.out.println("1st");
		else if(x<0&&y>0)
			System.out.println("2nd");
		else if(x<0&&y<0)
			System.out.println("3rd");
		else if(x>0 && y<0)
			System.out.println("4th");
		else if(x==0 && y!=0)
			System.out.println("x-axis");
		else if(x!=0 && y==0)
			System.out.println("y-axis");
		else if(x==0 && y==0)
			System.out.println("orgin");
	}
}
