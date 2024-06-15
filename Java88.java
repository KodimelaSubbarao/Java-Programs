interface NIT
{
	int myInterface(int a, int b);
}
public class Java88 {
	public static void main(String[] args) {
		NIT nit = (a, b) ->
		{
			int div = a/b;
			int addition = a+b;
			return addition;
		};
	}
}
