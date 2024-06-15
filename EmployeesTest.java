public class EmployeesTest 
{
	public static String Check(Employees e)
	{
		String job=null;
		if(e.getSal()==90000.0)
			job= "Developer";
		else if(e.getSal()==60000.0)
			job= "Designer";
		else if(e.getSal()==40000.0)
			job= "Tester";
		return job;
	}
	public static void main(String[] args) 
	{
		Employees e1=new Employees(101,"raj",90000.0);
		Employees e2=new Employees(102,"sa",60000.0);
		Employees e3=new Employees(103,"rani",40000.0);
		System.out.println("Employee is a "+Check(e1));
		System.out.println("Employee is a "+Check(e2));
		System.out.println("Employee is a "+Check(e3));
	}
}
