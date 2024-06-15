package Arrays;

public class SampleArray 
{
	void array()
	{
		int [] arr= {10,20,30,40,50};
		int[] arr1= new int[]{0,1,2,3,4};
		int[] arr2=new int[5];
		arr2[0]=11;
		arr2[1]=12;
		arr2[2]=13;
		arr2[3]=14;
		arr2[4]=15;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("\n");
		int a=0;
		while(a<arr1.length)
		{
			System.out.println(arr[a]);
			a++;
		}
		System.out.println("\n");
		int b=0;
		do
		{
			System.out.println(arr2[b]);
			b++;
		}while(b<arr2.length);
	}
	public static void main(String[] args) 
	{
		SampleArray obj=new SampleArray();
		obj.array();
	}
}
