interface NIT
{
	void myInterface(int a, int b);
}
public class Java85 {
	public static void main(String[] args) {
		NIT nit = (int a, int b) -> System.out.println(a+b);
		nit.myInterface(5, 10);
	}
}