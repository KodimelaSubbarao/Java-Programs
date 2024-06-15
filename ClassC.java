package Subbarao;
import java.util.Scanner;
public class ClassC
{
	void meth1()
	{
		System.out.println("Called meth1()");
	}
	protected void finalize()
	{
		System.out.println("Grbage Collector");
	}
	void meth2()
	{
		System.out.println("Start");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("What is your name?");
		String s=scanner.nextLine();
		System.out.printf("Hi %s, How are you? \n",s);
		String status =scanner.nextLine();
		System.out.println(status);
		System.out.println("What is your age? \n");
		int i=scanner.nextInt();
		System.out.println(i);
		System.out.println("Thank you for valueable information");
		scanner.close(); 
	}
	void meth3()
	{
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("a= "+a);
		
		if (a<0)
		{
			System.out.println("this is a negative number");
		}
		if(a>0)
		{
			System.out.println("this is a positive number");
		}
		else
		{
			System.out.println("This is a zero");
		}
		sc.close();  
	}
	void meth4()
	{
		int a=39;
		if (a>35 && a<45)
		{
			System.out.println("Your are just passed");
		}
		else if (a>45 && a<70)
			{
				System.out.println("Your are passed");
			}
			
		
		else if (a>70)
			{
				System.out.println("Your are passed with good score");
			}
			
		else 
		{
			System.out.println("Your not passed");
		}   
	}
	void meth5()
	{
		System.out.println("enter anye number");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if (a %2==0)
		{
			System.out.println("this is even");
		}
		else
		{
			System.out.println("this is odd");
		}  
		sc.close();
	}
	void meth6()
	{
		int year = 13;
	    int month = 0;
	    int day = 8;
	
	    int dayOfWeek = (day + month + year + (year / 4) + 6) % 7;
	
	    if (dayOfWeek == 0) {
	      System.out.println("Sunday");
	    }
	    else if (dayOfWeek == 1) {
	      System.out.println("Monday");
	    }
	    else if (dayOfWeek == 2) {
	      System.out.println("Tuesday");
	    }
	    else if (dayOfWeek == 3) {
	      System.out.println("Wedneday");
	    }
	    else if (dayOfWeek == 4) {
	      System.out.println("Thurday");
	    }
	    else if (dayOfWeek == 5) {
	      System.out.println("Friday");
	    }
	    else
	    {
	      System.out.println("Sarurday");
	    }
	}
	void meth7()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a =sc.nextInt();
		
		switch(a%2)
		{
		case 0:
			System.out.println("It is even number ");
			break;
		case 1:
			System.out.println("It is odd number");
			break;
		default:
			System.err.println("Your are enter invalid number,please enter positive numbers only");
			
		} 
		sc.close();
	}
	void meth8()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter fisrt number");
		int i =sc.nextInt();
		System.out.println("enter second number");
		int j=sc.nextInt();
		System.out.println("enter anye operator (+,-,*,/,%)");
		char y= sc.next().charAt(0);
		sc.close();
		double z;
		switch(y)
		{
		case '+':
			z=i+j;
			System.out.println(z);
			break;
		case '-' :
			z=i-j;
			System.out.println(z);
			break;
		case '*':
			System.out.println(z=i*j);
			break;
		case '/':
			z=i/j;
			System.out.println(z);
			break;
		case  '%':
			z=i%j;
			System.out.println(z);
			break;
		default:
			System.out.printf("Error!operator is not correct");
		return;
		}
		
		System.out.printf("%d %c %d = %1.f",i,y,j,z);
		
	}
	void meth9()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year last two digits");
		int year = sc.nextInt();
		System.out.println("Enter the month code 'jan-0 ,fen-3 ,mar-3 ,apr-6 .may-1 ,jun-4 ,jul-6 ,aug-2 ,sep-5 ,oct-0 ,nov-3, dec-5'");
	    int month_code = sc.nextInt();
	    System.out.println("Enter the daycode 'sun-0, mon-1, tue-2, wen-3, thu-4 ,fri-5,sat-6");
	    int day_code = sc.nextInt();
	    System.out.println("Enter the century code '1600=6, 1700=4, 1800=2, 1900=0, 2000=6, 2100=4, 2200=2, 2300=0");
	    int century_code = sc.nextInt();
	    int dayOfWeek = ((day_code/7) + month_code +century_code+ ((year + (year / 4))/ 7)/7) ;
	    if (dayOfWeek == 0) {
	      System.out.println("Sunday");
	    }
	    else if (dayOfWeek == 1) {
	      System.out.println("Monday");
	    }
	    else if (dayOfWeek == 2) {
	      System.out.println("Tuesday");
	    }
	    else if (dayOfWeek == 3) {
	      System.out.println("Wedneday");
	    }
	    else if (dayOfWeek == 4) {
	      System.out.println("Thurday");
	    }
	    else if (dayOfWeek == 5) {
	      System.out.println("Friday");
	    }
	    else
	    {
	      System.out.println("Sarurday");
	    }
	    sc.close();
	}
	void meth10()
	{
		
	}
	void meth11()
	{	
		int i=0;
		while (i <=100) {
			System.out.println(i);
			i++;
			}	
	}
	void meth12()
	{
		int i=200;
		while (i<=500) {
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	void meth13()
	{
		int i=150;
		while (i<=200) {
			if (i%7==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	void meth14()
	{
		int [] arr=new int[5];
		arr[0]=10;
		arr[2]=30;
		arr[4]=50;
		System.out.println(arr[2]);
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		System.out.println("\n"+sum);

	}
	void meth15()
	{
		
	}
	void meth16()
	{
		
	}
	void meth17()
	{
		
	}
	void meth18()
	{
		
	}
	void meth19()
	{
		
	}
	void meth20()
	{
		
	}
	
	public int i;
	public ClassC()
	{
		i=10;
		System.out.println(i);
		System.out.println("Hello ");
	}
	public ClassC(int a)
	{
		i=a;
		System.out.println("a= "+i);
	}   
	
	public static void main(String[] args) 
	{ 
		ClassC aobj=new ClassC();
		ClassC aobj1=new ClassC();
		aobj.meth1();
		System.out.println(aobj1.hashCode());
		System.out.println(aobj.hashCode());
		System.out.println(aobj1.equals(aobj));
		System.out.println(aobj1.equals(aobj1));
		System.out.println(aobj.toString());
		System.out.println(aobj1.toString());
		System.out.println(aobj.getClass());
		System.out.println(aobj1.getClass());
		aobj1=null;
		aobj=null;
		System.gc(); 
		
		ClassC aobj2=new ClassC();
		aobj2.meth2();
		aobj2.meth3();
		aobj2.meth4();
		aobj2.meth5();
		aobj2.meth6();
		aobj2.meth7();
		aobj2.meth8();
		aobj2.meth9();
		aobj2.meth10();
		aobj2.meth11();
		aobj2.meth12();
		aobj2.meth13();
		aobj2.meth14();
		
	}
}


