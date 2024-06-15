public class StudentGradeCalculator 
{
	public static void main(String[] args) 
	{
		Student1 std=new Student1("Subbu",88);
		StudentGrade sg=CalculateStudentGrade.calculateGrade(std);
		System.out.println(std+"  "+sg);
	}
}
