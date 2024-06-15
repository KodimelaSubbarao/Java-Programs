package Collections;
import java.util.*;
public class Assigment 
{
	static void meth1()
	{
		ArrayList<Integer> al=new ArrayList<>();   
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(10);
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			sum +=al.get(i);
		}
		System.out.println("sum : "+sum);
		System.out.println("average : "+(sum/al.size()));
	}
	static void meth2()
	{
		ArrayList<Integer> al=new ArrayList<>();   
		al.add(4);
		al.add(5);
		al.add(0);
		al.add(9);
		al.add(8);
		al.add(10);
		int sum=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2==0)
			{
				sum +=al.get(i);
			}
		}
		System.out.println("sum of even numbers : "+sum);
	}
	static void meth3()
	{
		ArrayList<Integer> al=new ArrayList<>();   
		al.add(4);
		al.add(9);
		al.add(8);
		ArrayList<Integer> al1=new ArrayList<>();  
		al1.add(5);
		al1.add(0);
		al1.add(10);
		ArrayList<Integer> al2=new ArrayList<>();  
		al2.addAll(al);
		al2.addAll(al1);
		System.out.println(al2);
	}
	public static void main(String[] args) 
	{
		 //meth1();
		// meth2();
		meth3();
	}
}
