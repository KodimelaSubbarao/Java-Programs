public class CalculateStudentGrade 
{
	private static  char c;
	public static StudentGrade  calculateGrade(Student1 std)
	{
		if(100>90)
			c='A';
		else if(90>=75)
			c='B';
		else if(75>=60)
			c='C';
		else if(60>=0)
			c='D';
		StudentGrade sg=new StudentGrade(std,c);
		return sg;
	}
}
