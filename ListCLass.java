package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCLass
{
	void Arraylist()
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(10);//insertion order maintained
		al.add(100);//heterogeneous data allowed
		al.add("JAVA");//duplicates are allowed
		al.add('C');//available in java 1.2V
		al.add(null);//null is allowed
		al.add(" ");//default capacity is 10
		al.add(25);// size increase by half
		al.add(2,1000);// not synchronized
		System.out.println(al);
	}
	void Linkedlist()
	{
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10); //insertion order is maintained 
		ll.add(200); //Heterogeneous data allowed
		ll.add("SA");//availability in 1.2V
		ll.add(null);//duplicates are allowed
		ll.add(200);// null allowed
		ll.add('s');//default size is 0
		ll.add(4,1);//size increase by double
		ll.add(true);// not synchronized
		System.out.println(ll);
	}
	public static void main(String[] args) 
	{
		ListCLass lc=new ListCLass();
		lc.Arraylist();
		lc.Linkedlist();
	}
}
