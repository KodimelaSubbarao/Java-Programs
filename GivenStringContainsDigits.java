class GivenStringContainsDigits 
{
	public static void main(String[] args) 
	{
		String str="Subbu123";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=0 && str.charAt(i)<=9)
			{
				System.out.println("Given String Contains Digits");
				break;
			}
			else
			{
				System.out.println("Given String not Contains Digits");
				break;
			}
		}
	}
}
