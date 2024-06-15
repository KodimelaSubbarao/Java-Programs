public class Student101Grade 
{
	private Student101 std;
	private char grade;
	public Student101Grade(Student101 std,char grade)
	{
		this.std=std;
		this.grade=grade;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	public Student101 getStd()
	{
		return this.std;
	}
	public char getGrade()
	{
		return this.grade;
	}
	public String toString(){
		return "Name : "+std.getName()+" Marks : "+std.getMarks()+" Grade : "+this.grade;
	}

	
}
