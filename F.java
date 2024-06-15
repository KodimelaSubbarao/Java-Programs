import java.util.Arrays;
import java.util.stream.Stream;
class F
{
	public static void main(String[] args) 
	{
		int[] arr={10,20,30,40,50};
		Arrays.stream(arr).forEach(val->System.out.println(val));
		System.out.println();
		Arrays.stream(arr).forEach(System.out::println);
	
	
	/*	Object Object="raja";
		//System System="rani"; //CE  String cannot be converted to System
		String String ="String";
		System.out.println("Hello World!"+String);
		System.out.println(Object);
	*/
	}
}
