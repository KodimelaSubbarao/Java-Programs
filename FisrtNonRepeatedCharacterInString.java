class FisrtNonRepeatedCharacterInString
{
	public static void main(String[] args) 
	{
		String s="ububaraoS";
		String result="";		
			for(int i=0;i<s.length();i++)
			{
				int c=0;

			if(s.charAt(i)!=' ')
			{
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j) && i!=j)
					{
						c++;
						break;
					}
				}
				if(c==0){	
					result=result+s.charAt(i);
					break;
				}
			}	
			
		}
		System.out.println(result);
	}
}
