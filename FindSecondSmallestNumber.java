package com.sa.arrays;

public class FindSecondSmallestNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {23,2,223,45,3,4,65,23,324};
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>first && arr[i]<second)
			{
				second=arr[i];
			}
		}
		if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + second);
        }
	}
}
