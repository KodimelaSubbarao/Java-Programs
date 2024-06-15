package Tasks;

import java.util.Scanner;

public class Employee 
{
	static Scanner sc=new Scanner(System.in);
	static void meth1()
	{
		int a=1;
		while(a<=1)
		{
			System.out.println("\n\tWelcome to KSR Company\n");
			System.out.print("Enter Your Employee Name: ");
			String empName=sc.next();
			System.out.print("\nEnter Your Employee ID: ");
			int empId=sc.nextInt();
			System.out.print("\nEnter Your Employee Department Name: ");
			String empDept=sc.next();
			System.out.print("\nEnter Your Employee Address: ");
			sc.nextLine();
			String empAddress=sc.nextLine();
			
			switch(empId)
			{
				case 101:
					System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
					break;
				case 102:
					System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
					break;
				case 103:
					System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
					break;
				case 104:
					System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
					break;
				case 105:
					System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
					break;
				default:
			/*		System.out.println("\nEmployee Name: "+empName);
					System.out.println("Employee ID: "+empId);
					System.out.println("Employee Department Name: "+empDept);
					System.out.println("Employee Address: "+empAddress);
			*/		
						System.err.println("\n\tInvalid Employee ID ");
						System.err.print(a+" Chance complited and You have "+(3-a)+" Chances only\n");
						a--;
					break;
			}
			a++;
		}
		
	}
	public static void main(String[] args) 
	{
		meth1();
	}

}
