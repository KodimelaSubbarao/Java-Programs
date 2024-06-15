package Tasks;
import java.util.Scanner;
public class Encapsulation2 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		Encapsulation1 obj= new Encapsulation1();
		System.out.println("Enter Your EmpName");
		obj.setEmpName(sc.next());
		System.out.println("Enter Your Id");
		obj.setEmpId(sc.nextInt());
		System.out.println("Enter Your Salary");
		obj.setEmpSal(sc.nextInt());
		System.out.println("Enter Your Experience");
		obj.setEmpExp(sc.nextInt());
		System.out.println("\nUser Enter Details ...........!");
		System.out.println("Emp Name : "+obj.getEmpName());
		System.out.println("Emp Id : "+obj.getEmpId());
		System.out.println("Emp sal : "+obj.getEmpSal());
		System.out.println("Emp exp: "+obj.getEmpExp());
		sc.close();
	}
	public static void main(String [] args)
	{
		new Encapsulation2().meth1();
	}
}
