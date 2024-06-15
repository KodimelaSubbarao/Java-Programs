public class Pattern1 
{
	public static void main(String[] args) 
	{
		int x= 4;
		int y=6;
		for(int i=0;i<x;i++)
		{
			for (int j=0;j<y ;j++)
			{
				if(i==0 || j==0 || i==x-1 || j==y-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
