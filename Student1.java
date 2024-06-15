public class Student1
{
	private String name;
	private int marks;
	public Student1(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public String getName()
	{
		return this.name;
	}
	public int getMarks()
	{
		return this.marks;
	}
	public String toString()
	{
		return "Student Name : "+this.name;
	}
}
