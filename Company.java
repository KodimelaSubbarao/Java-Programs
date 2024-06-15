public class Company 
{
	public static void main(String[] args) 
	{
		System.out.println("Employee details Entering");
		Employee e1=new Employee();
		e1.eId=1001;
		e1.eName="Subbu";
		e1.ePhNo=9121941486L;
		e1.eJob="Java Developer";
		e1.eSal=31500.00;
		Employee e2=new Employee();
		e2.eId=1002;
		e2.eName="Rani";
		e2.ePhNo=9121988986L;
		e2.eJob="SQL Developer";
		e2.eSal=23500.00;
		System.out.println("Employee details Entered");
		System.out.println("\nEmployee details Retriving");
		System.out.println(e1.eId);
		System.out.println(e1.eName);
		System.out.println(e1.ePhNo);
		System.out.println(e1.eJob);
		System.out.println(e1.eSal);
		System.out.println("\n");
		System.out.println(e2.eId);
		System.out.println(e2.eName);
		System.out.println(e2.ePhNo);
		System.out.println(e2.eJob);
		System.out.println(e2.eSal);
		System.out.println("\n");
	}
}
