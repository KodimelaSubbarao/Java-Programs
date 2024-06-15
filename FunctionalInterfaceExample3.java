interface NIT
{
	String str(String nit);
}
public class FunctionalInterfaceExample3
{
	public static void main(String[] args) {
	NIT nit = (String nit) -> nit +"";
	}
}

