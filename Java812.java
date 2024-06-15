public class Java812 {
	interface NIT 
	{
		int myInterface(int a, int b); 
	}
	
	public static void main(String[] args) {
		NIT nit = (int a, int b) -> a/b;
		int a = nit.myInterface(15, 110);
		System.out.println(a);
	}
}
