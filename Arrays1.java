package Tasks;
import java.util.Arrays;
public class Arrays1 
{
	int[] meth1(int [] arr)
	{
		int rev[]=new int [arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;)
		{	
			
			rev[j++] +=arr[i--];
		}
		return rev;
	}
	int meth2(int [] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public int[] maxEnd3(int[] nums)

	{
		//Given an array of ints length 3, figure out which is larger, 
		//the first or last element in the array,
		//and set all the other elements to be that value. 
		//Return the changed array.
		
	    if(nums[0]>nums[1] && nums[0]>nums[2])
	    {
	    	nums[1]=nums[0];
	    	nums[2]=nums[0];
	    	return nums;
	    }
	    else if(nums[1]>nums[2])
	    {
	    	nums[0]=nums[1];
	    	nums[2]=nums[1];
	    	return nums;
	    }
	    else
	    {
	    	nums[0]=nums[2];
	    	nums[1]=nums[2];
	    	return nums;
	    }
	}
	public int[] middleWay(int[] a, int[] b)
	{
		//Given 2 int arrays, a and b, each length 3,
		//return a new array length 2 containing their middle elements.
	    int c[]=new int[2];
	    c[0]=a[1];
	    c[1]=b[1];
	    return c;
	}
	public int[] makeEnds(int[] nums)
	{
    //Given an array of ints, return a new array length 2 containing the first and last elements 
	//from the original array. The original array will be length 1 or more.
		int c[]=new int[2];
		c[0]=nums[0];
		c[1]=nums[nums.length-1];
		return c;
	}

	public static void main(String[] args) 
	{
		Arrays1 aobj=new Arrays1();
		int x[]= {1, 2, 3, 4};
		int y[]= {4, 5, 6};
		int [] arr1=aobj.makeEnds(x);
		System.out.println(Arrays.toString(arr1));
		var aa=10;
		System.out.println(aa);
	}
}
