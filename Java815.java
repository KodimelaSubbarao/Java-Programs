interface NIT
{
	String myInterface(String a);
}
public class Java815 {
	
	public static void main(String[] args) {
		
		//without parameter
		NIT nit = information -> System.out.println("Welcome to " + information);
		nit.myInterface("NIT");
	}
}