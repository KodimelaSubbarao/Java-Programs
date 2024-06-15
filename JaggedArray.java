package Arrays;

public class JaggedArray 
{
	void jaggedArray()
	{
		int[][] arr= {
							{10,20},
							{30,40,50},
							{60,70,80,90}
					  };
		int [][] arr1=new int[][] {
										{1,2,3},
										{4,5},
										{6}
								   };
		int[][] arr2=new int[5][];
		arr2[0]=new int[5];
		arr2[1]=new int[3];
		arr2[2]=new int[1];
		arr2[3]=new int[3];
		arr2[4]=new int[5];
		arr2[0][0]=11;
		arr2[0][1]=12;
		arr2[0][2]=13;
		arr2[0][3]=14;
		arr2[0][4]=15;
		arr2[1][0]=16;
		arr2[1][1]=17;
		arr2[1][2]=18;
		arr2[2][0]=19;
		arr2[3][0]=20;
		arr2[3][1]=21;
		arr2[3][2]=22;
		arr2[4][0]=23;
		arr2[4][1]=24;
		arr2[4][2]=25;
		arr2[4][3]=26;
		arr2[4][4]=27;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int a=0;a<arr1.length;a++)
		{
			for(int b=0;b<arr1[a].length;b++)
			{
				System.out.print(arr1[a][b]+" ");
			}
			System.out.println();
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
	}
	public static void main(String[] args) 
	{
		JaggedArray obj=new JaggedArray();
		obj.jaggedArray();

	}

}
