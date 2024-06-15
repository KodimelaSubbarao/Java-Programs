public class  Employees
{
	private int eId;
	private String eName;
	private double eSal;

	public Employees(int eId,String eName,double eSal)
	{
		this.eId=eId;
		this.eName=eName;
		this.eSal=eSal;
	}
	public int getId()
	{
		return this.eId;
	}
	public String getName()
	{
		return this.eName;
	}
	public double getSal()
	{
		return this.eSal;
	}
}
