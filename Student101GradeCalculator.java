public class Student101GradeCalculator  
{
	public static void main(String[] args) 
	{
		Student101 std=new Student101("Subbu",60);
		Student101Grade sg=CalculateStudent101Grade.calculateGrade(std);
		System.out.println(sg);
	}
}
