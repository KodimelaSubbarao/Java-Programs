package Arrays;
import java.util.Scanner;
public class Exam1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the anye "+n+" numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter anye one number");
		int a=sc.nextInt();
		int c=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==a)
			{
				System.out.println(j);
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(-1);
		}
		sc.close();
	}
}
