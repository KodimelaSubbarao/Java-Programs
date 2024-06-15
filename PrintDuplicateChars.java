class  PrintDuplicateChars
{
	public static void main(String[] args) 
	{
		String str="Subbarao";
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			if(str.charAt(i)!=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						count++;
					}
				}
				if(count>1)
					result +=str.charAt(i)+" : "+count+"   ";
			}
		}
		System.out.println(result);
	}
}
