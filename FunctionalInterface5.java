interface NIT
{
	String nit(String name);
}
public class FunctionalInterface5
{
	public static void main(String[] args) {
		NIT nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));		
	}
}