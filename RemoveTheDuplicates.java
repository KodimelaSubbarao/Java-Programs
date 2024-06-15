class RemoveTheDuplicates
{
	public static void main(String[] args) 
	{
		String str="Subbarao";
		String result="";
		char arr[]=str.toCharArray();
		java.util.LinkedHashSet<Character> ts=new java.util.LinkedHashSet<>();
		for(char c:arr)
		{
			ts.add(c);
		}
		for(char ch:ts)
		{
			result +=ch;
		}
		System.out.println(result);
	}
}
