interface NIT
{
	int myInterface(int a, int b);
}
public class Java811 {
	int calculate(int i, int j, NIT nit)
	{
		return nit.myInterface(i,j);
	}
	public static void main(String[] args) {
		int result = 0;
		NIT addition = (a,b) -> a+b;
		NIT multiplication = (a,b) -> a*b;
		NIT division = (a,b) -> a/b;
		Java811 java = new Java811();
		result = java.calculate(15, 5, multiplication);
		System.out.println(result);
		result = java.calculate(result, result, addition);
		System.out.println(result);
		result = java.calculate(result, result, division);
		System.out.println(result);
	}
}