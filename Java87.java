interface NIT
{
	int myInterface(int a, int b);
}
public class Java87 {
	public static void main(String[] args) {
		NIT nit = (int a, int b) ->
		{
			return a+b;
		};
	}
}