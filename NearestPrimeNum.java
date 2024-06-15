public class NearestPrimeNum 
{
	public static void main(String[] args) 
	{	int c=0;
		int s=10;
		for(int i=s;;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					c++;
			}
			if(c==2){
				System.out.println(i);
				return;
			}

		}
	}
}
