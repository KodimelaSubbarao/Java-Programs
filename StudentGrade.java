public class StudentGrade 
{
	private Student1 std;
	private char grade;
	public StudentGrade(Student1 std, char grade)
	{
		this.std=std;
		this.grade=grade;
	}
	public void setStd(Student1 std)
	{
		this.std=std;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	public Student1 getStd()
	{
		return this.std;
	}
	public char getGrade()
	{
		return this.grade;
	}
	public String toString()
	{
		return "Grade is : "+this.grade;
	}
}
