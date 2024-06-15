package BasicPrograms;
public class Strings 
{
	void meth1()
	{
		StringBuffer s=new StringBuffer("Subba @1%$ Rao 66558 Hello EveryOne SA and KSR");
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			String s1=(""+s.charAt(i));
			if(s1.equals(s1.toUpperCase()))
			{
				s2+=s1.toLowerCase();
			}
			else if(s1.equals(s1.toLowerCase()))
			{
				s2+=s1.toUpperCase();
			}
			else
			{
				s2+=s1;
			}
		}
		System.out.println(s2);
	}
	public static void main(String[] args) 
	{
		Strings sobj=new Strings();
		sobj.meth1();
	}
}
