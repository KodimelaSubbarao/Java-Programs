public class  SortArray
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;//10
		int temp=0;
		for(int i=1;i<n;i=i+2)// 1<10 
		{
			temp=arr[n-1]; //arr[9]=10
			for(int j=n-1;j>i;j--)//9>1
			{
				arr[j]=arr[j-1];//arr[9]=9
			}
			arr[i]=temp;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}
}
