package Subbarao;

public class Student 
{
	String name;
	public Student()
	{
		name="Unknown";
	}
	public Student(String s)
	{
		name=s;
	}
	public void meth1()
	{
		System.out.println("Student Name is : "+name);
	}
	public static void main(String[] args) 
	{
		Student obj=new Student();
		obj.meth1();
		Student obj1=new Student("King");
		obj1.meth1();
	}
}





