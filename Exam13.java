class Foo {
	void print() {
		System.out.println("Java");
	}
}
class Doo {
	static Doo foo = new Doo();
	void print()
	{
		System.out.println("Adv Java");
	}
	public static Foo foo()
	{
		return foo;
	}
}
public class Exam13 {
	public static void main(String[] args) {
		Doo.foo().print();
	}
}
