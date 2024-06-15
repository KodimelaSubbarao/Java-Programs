import java.util.*;
public class SimpleExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Sum is :: "+(a+b));
		}catch(InputMismatchException  e)
		{
			System.out.println(" Error Message "+e.getMessage());
			System.out.println("Class with message "+e.toString());
			System.out.println();
			e.printStackTrace();
		}
	//	System.out.println("Hello World!");
	}
}
