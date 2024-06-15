class RemoveChar 
{
	public static void main(String[] args) 
	{
		String str="Java is Awesome";
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a')
			{
				result+=str.charAt(i);
			}
		}
			
		System.out.println(result);
	}
}
