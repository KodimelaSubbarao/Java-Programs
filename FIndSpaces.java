package practice;

public class FIndSpaces
{
	public static void main(String[] args)
	{
		String s="raja rani, sa ram sita raju";
		String[] arr=s.split(" ");
		int len=arr.length;
		System.out.println(len-1);
	}
}
