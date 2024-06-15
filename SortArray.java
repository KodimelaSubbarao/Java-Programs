package com.sa.string;

public class  SortArray
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		int temp=0;
		for(int i=1;i<n;i=i+2)
		{
			temp=arr[n-1];
			for(int j=n-1;j>i;j--)
			{
				arr[j]=arr[j-1];
			System.out.println( arr[j]+"   "+arr[j-1]);
			System.out.println(java.util.Arrays.toString(arr));
			}
			arr[i]=temp;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}

