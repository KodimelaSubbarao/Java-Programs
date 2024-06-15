class LastNonRepeatedCharacterInString 
{
	public static void main(String[] args) 
	{
		String str="Subbarao";
		String last="";
		for(int i=str.length()-1;i>=0;i--)
		{
			int count=0;
			if(i!=' ')
			{
				
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(j)==str.charAt(i) && i!=j)
					{
						count++;
						break;
					}
				}
				if(count==0){
					last +=str.charAt(i);
					System.out.println(last);
					break;
				}
			}		
		}
		//System.out.println("Hello World!");
	}
}
