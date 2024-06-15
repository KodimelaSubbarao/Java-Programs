package com.sa.numbers;

public class LeapYear 
{
	public static void approach1()
	{
		int year=2024;
		
		if(year%400==0)
			System.out.println("Leap Year");
		else if(year%4==0 && year%100!=0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
	public static void approach2()
	{
		int year=2025;
		
		if(year%400==0 || year%4==0 && year%100!=0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
	public static void main(String[] args) 
	{
		approach2();
	}
		
}
