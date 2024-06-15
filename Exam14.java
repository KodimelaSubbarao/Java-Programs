public class Exam14{
	int x;
	int y;
	Exam14()
	{
		x = 10;
		y = 20;
	}
	Exam14(Exam14 exam)
	{
		System.out.println(exam.x+this.x+exam.y+this.y);
	}
	public static void main(String[] args) {
		Exam14 e1 = new Exam14();
		e1.x = 20;
		new Exam14(e1);
	}
}
