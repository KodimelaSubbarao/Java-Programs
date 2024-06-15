public class CalculateStudent101Grade  
{
	public static Student101Grade   calculateGrade(Student101 std)
	{
		Student101Grade sg=new Student101Grade(std,' ');
		if(std.getMarks()>90)
			sg.setGrade('A');
		else if(std.getMarks()>=75)
			sg.setGrade('B');
		else if(std.getMarks()>=60)
			sg.setGrade('C');
		else if(std.getMarks()<60)
			sg.setGrade('D');
		return sg;
	}
}
