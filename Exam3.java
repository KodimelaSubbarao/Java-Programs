class Foo {
	void print() {
		System.out.println("Java Is Awesome");
	}
}
class Doo {
	static Doo foo = new Doo();
	void print()
	{
		System.out.println("Adv Java Is More Awesome");
	}
	public static Foo foo()
	{
		return foo;
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Doo.foo().print();
	}
}

/*
class Foo {
	void print() {
		System.out.println("Java Is Awesome");
	}
}
class Doo {
	static Doo foo = new Doo();
	void print()
	{
		System.out.println("Adv Java Is More Awesome");
	}
	public static Foo foo()
	{
		return foo;
	}
}
public class Exam {
	public static void main(String[] args) {
		Doo.foo().print();
	}
}
*/
