public class ReverseNum 
{
	public static void main(String[] args) 
	{
		int num=6; 
		int i=1;
		int perfect=0;
		while(i<num) 
		{
			if(num%i==0)
				perfect=perfect+i;
			i++;
		}
		if(perfect==num)
			System.out.println("perfect");
		else
			System.out.println(" not perfect");
		
	}
}
