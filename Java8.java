interface NIT1
{
	public int myInterface(int a);
}

public class Java8 {
	public static void main(String[] args) {
		NIT1 nit = (a) -> a+1;
		int i = nit.myInterface(6);
		System.out.println(i);
	}
}