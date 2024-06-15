class NonRepeatedCharacterInString2
{
    public static void main(String args[])
    {
        String str ="kodimela subbarao";
		String result="";
        for(char i : str.toCharArray())
        {
            // if current character is the last occurrence in the string
			if(i!=' '){
				if (str.indexOf(i) == str.lastIndexOf(i))
				{
					result+=i;
				}
			}
        }
            System.out.println(result);

    }
}