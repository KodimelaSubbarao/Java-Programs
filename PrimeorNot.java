package BasicPrograms;

public class PrimeorNot 
{
	void meth1()
	{
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;	
			}
		}
		if(count==2)
			System.out.println("prime");
		else 
			System.out.println("not prime");
	}
	void meth2()
	{
		int n=12;
		if(n>1)
		{
			for(int i=2;i<=n;i++)
			{
				for(int j=2;j<=i;j++)
				{
					if(i==j)
						System.out.println(i);
					if(i%j==0)
						break;
				}
			}
		}
		else
		System.out.println("not Prime");
	}
	void meth3()
	{
		
	}
	public static void main(String[] args) 
	{
		new PrimeorNot().meth3();
	}
}
