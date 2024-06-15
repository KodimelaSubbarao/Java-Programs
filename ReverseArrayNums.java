package BasicPrograms;

public class ReverseArrayNums 
{
	void meth1()
	{
		int a[]={10,20,5,18,30};
	
		for(int i=1;i<a.length ; i++)
		{
			for(int j=i-1;j<a.length;)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i=0;
				}
				break;
			}
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	void meth2()
	{
		int a[]={10,20,5,18,30};
	
		for(int i=1;i<a.length ; i++)
		{
			for(int j=i-1;j<a.length;)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i=0;
				}
				break;
			}
		}
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) 
	{
		new ReverseArrayNums().meth2();
	}
}
