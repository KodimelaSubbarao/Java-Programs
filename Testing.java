interface NIT
{
	public int myInterface(int a);
}
public class Testing {
	public static void main(String[] args) {
		NIT nit = (String a) -> a*5;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}