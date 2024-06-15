package Tasks;
import java.util.Arrays;
public class Array 
{
	char[] meth1(char []arr,String days[],String s)
	{
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(days));
		System.out.println(s);
		
		System.out.println();
		for(char c:arr)
			System.out.print(c+" ");
		System.out.println("\n");
		for(String s1:days)
			System.out.print(s1+" ");
		System.out.println();
		System.out.println("\nString length : "+s.length()+"\n");
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println("\n");
		
		for(int i=days.length-1;i>=0;i--)
			System.out.print(days[i]+" ");
		System.out.println("\n");
		
		return new char[]{'a',222,101,201,'A'};
	}
	public static void main(String[] args) 
	{
		Array aobj=new Array();
		//System.out.println(Arrays.toString(aobj.meth1(new char[]{'A','a','s',99},new String[]{"Mon","Tue","Wen","Thu","Fri","Sat","Sun"},"Java is Awesome")));
		//String c1=Arrays.toString(aobj.meth1(new char[]{'A','a','s',99},new String[]{"Mon","Tue","Wen","Thu","Fri","Sat","Sun"},"Java is Awesome"));
		//System.out.println(c1);
		char c1 []=aobj.meth1(new char[]{'A','a','s',99},new String[]{"Mon","Tue","Wen","Thu","Fri","Sat","Sun"},"Java is Awesome");
		System.out.println(Arrays.toString(c1));
		System.out.println();
		for(char c:c1)
			System.out.print(c+" ");
		System.out.println("\n");
		
		for(int i=c1.length-1;i>=0;i--)
			System.out.print(c1[i]+" ");
		System.out.println("\n");
		
	}
}
