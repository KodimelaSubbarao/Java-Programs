public class ConstructorTest {

	public static void main(String...args)
	{
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(c1);    
        Complex c3 = c1;  
        System.out.println(c2);

	}
/*	
	public static void main(String...args)
	{
		T obj=new T();
		System.out.println(obj.x);
	}
	
	int a;
	public ConstructorTest(int a) {
		this.a =a;
	}
	
	public static void main(String[] args) {
		ConstructorTest nit = new ConstructorTest(10);
		nit.a;
	}

	public int a = 100;
	public ConstructorTest() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorTest test = new ConstructorTest();
	}
	
	public int a = 10;
	public ConstructorTest() {
	}
	public ConstructorTest(int a) {
		this.a = a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		ConstructorTest test = new ConstructorTest();
	}


	public int a = 10;
	public String ConstructorTest(int a) {
		this.a = a;
	}
*/
}