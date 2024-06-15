interface NIT
{
	int myInterface(int a, int b);
}
public class Java89{
	int calculate(int i, int j, NIT nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		NIT addition = (a,b) -> a+b;
		NIT multiplication = (a,b) -> a*b;
		NIT division = (a,b) -> a/b;
		Java89 java = new Java89();
		int result = java.calculate(15, 5, multiplication);
		System.out.println(result);
	}
}