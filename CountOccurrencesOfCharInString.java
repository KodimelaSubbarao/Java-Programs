class CountOccurrencesOfCharInString
{
	public static void main(String[] args) 
	{
		String str="Subbarao";
		java.util.HashMap<Character,Integer> hm=new java.util.HashMap<Character,Integer>();

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				int count =1;
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						hm.put(str.charAt(i),count);
						count++;
					}
				}
			}
		}
		System.out.println(hm);
	}
}
