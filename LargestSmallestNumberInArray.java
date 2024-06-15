package com.sa.arrays;

public class LargestSmallestNumberInArray {

	public static void largestNumber()
	{
		int arr[]= {43,54,78,98,98,43,112,23,78};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println(max);
	}
	public static void smallestNumber()
	{
		int arr[]= {43,54,78,98,98,43,112,23,78};
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]<min)
				min=arr[i];
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		largestNumber();
		smallestNumber();
	}

}
