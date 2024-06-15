package Tasks;
public class Company 
{
	public void salary(int sal, int join_Year, int current_Year)
	{
		int year=current_Year - join_Year;
		if(year>5)
		{
			int bonus=(sal*5)/100;
			System.out.println("Your bonus amount is"+bonus+"and total salary is "+(sal+bonus));
			System.out.println("You got Successful Bonus");
		}
		else
		{
			System.out.println("Your total salary is"+sal);
			System.out.println("You want bonus we work another"+year+"years");
		}
	}
	public static void main(String[] args) 
	{
		new Company().salary(21000, 2001, 2023);
	}
}
