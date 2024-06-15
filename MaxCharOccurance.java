class MaxCharOccurance 
{
	public static void main(String[] args) 
	{
		String str="ssaaaa";
		String result="";
		int max=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				int count=1;
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						count++;
					}
				}
				if(max<count)
				{
					result="";
					max=count;
					result+=str.charAt(i)+"-"+count+"  ";
				}
				else if(max<=count)
				{
					max=count;
					result+=str.charAt(i)+"-"+count+"  ";
				}
			}
		}
		System.out.println(result);
	}
}
