class RemoveGivenChar 
{
	public static void main(String[] args) 
	{
		String str="Subbarao";
		char ch='a';
		String result="";

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				result +=str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
