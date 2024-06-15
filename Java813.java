interface NIT
{
	String myInterface(String a);
}
public class Java813 {
	public static void main(String[] args) {
		NIT nit = (a) -> {return a;};
		System.out.println(nit.myInterface("NIT"));
	}
}