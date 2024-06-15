interface NIT2
{	
	int myInterface(int a);
}

interface NewInterface
{
	void alpha(String a);
}

public class Java81 {
	public static void main(String[] args) {
		NIT2 nit = (a) -> a*a*a;
		System.out.println(nit.myInterface(5));
		NewInterface result = (a) -> System.out.println("Welcome to NareshIT");
		result.alpha("");
	}
}
