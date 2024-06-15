public class Exam4 {
	int x;
	int y;
	Exam4()
	{
		x = 10;
		y = 20;
	}
	Exam4(Exam4 exam)
	{
		System.out.println(exam.x);
		System.out.println(exam.y);
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(exam.x+this.x+exam.y+this.y);
	}
	public static void main(String[] args) {
		Exam4 e1 = new Exam4();
		e1.x = 20;
		new Exam4(e1);
	}
}
