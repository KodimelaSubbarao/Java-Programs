 class Foo {
	{
		int a = 25;
	}
	{
		Foo obj = new Foo();
		System.out.println(a);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		new Foo();
	}
}
