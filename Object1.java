package Collections;

public class Object1 
{
	int id;
	String name;
	String course;
	Object1(int id, String name,String course)
	{
		this.id=id;
		this.name=name;
		this.course=course;
	}
	public String toString()
	{
		return id+" "+name+" "+course;
	}
}
