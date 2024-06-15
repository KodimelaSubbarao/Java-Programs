class Foo {
	void print() {
		System.out.println("Java Is Great");
	}
}
class Doo {
	static Foo foo = new Foo();
	void print()
	{
		System.out.println("Adv Java Is Beautiful");
	}
	public static Foo foo()
	{
		return foo;
	}
}
public class Exam12 {
	public static void main(String[] args) {
		Doo.foo().print();
	}
}
