package Arrays;

public class Two_D_Array 
{
	void Two_D_array()
	{
		int [][] arr= {{0,1},{2,3},{4,5},{6,7},{8,9}};
		int [][] arr1=new int [][] {{10,11,12},{13,14,15},{16,17,18}};
		int [][] arr2=new int[3][2];
		arr2[0][0]=10;
		arr2[0][1]=20;
		arr2[1][0]=30;
		arr2[1][1]=40;
		arr2[2][0]=50;
		arr2[2][1]=60;

		int i;
		for(i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		int a;
		int b;
		for(a=0;a<arr1.length;a++)
		{
			for(b=0;b<arr1[a].length;b++)
			{
				System.out.print(arr1[a][b]+" ");
			}
			System.out.println( );
		}
		System.out.println("\n");
		for(int x=0;x<arr2.length;x++)
		{
			for(int y=0;y<arr2[x].length;y++)
			{
				System.out.print(arr2[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		int []arr3= {101,102,103,104,105};
		int sum=0;
		for(int value:arr3)
		{
			System.out.println(value);
			sum+=value;
		}
		System.out.println("\t"+sum);
	}
	public static void main(String[] args) 
	{
		Two_D_Array obj=new Two_D_Array();
		obj.Two_D_array();
	}
}
