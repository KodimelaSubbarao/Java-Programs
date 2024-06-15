package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 
{
	public static void main(String [] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);//instretion order maintained
		al.add("java");//Heterogeneous data allowed
		al.add(11.11);//null are allowed
		al.add('a');//duplicates allowed
		al.add(10);//1.2 Version introduced
		al.add(true);//default capacity is 10
		al.add(null);// size increased in half of the current capacity
		al.add(20);//not synchronized
		System.out.println(al);
		System.out.println("find how many elements in AL-size(): "+al.size());
		System.out.println("get the specific element index value based- get() : "+al.get(3));
		System.out.println(al.get(7));
		System.out.println(al.get(1));
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		//for-loop
		for(int i=0;i<al1.size();i++)
		{
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		for(int i=al1.size()-1;i>=0;i--)
		{
			System.out.print(al1.get(i)+" ");
		}
		System.out.println();
		//for-each-loop
		for(Object o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println();
		for(Integer i:al1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:al1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//Iterator Interface
		Iterator<Integer> i= al1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		System.out.println(al1.size());
		al1.add(1, 100);
		al1.add(3,300);
		System.out.println(al1);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(10);
		al2.add(100);
		al2.add(300);
		System.out.println(al2);
		System.out.println(al1.addAll(al2));
		System.out.println(al1.contains(20));
		System.out.println(al1.contains(2000));
		System.out.println(al1.contains(al2));
		System.out.println(al2.containsAll(al1));
		System.out.println(al1.containsAll(al2));
		System.out.println(al1.hashCode());
		System.out.println(al1.indexOf(al2));
		System.out.println(al1.indexOf(100));
		System.out.println(al1.lastIndexOf(10));
		System.out.println(al1.isEmpty());
		System.out.println(al1.remove((Object)300));
		System.out.println(al1);
//		System.out.println(al1.removeAll(al2));
//		System.out.println(al1);
//		System.out.println(al1.retainAll(al2));
//		System.out.println(al1);
		System.out.println(al1.toString());
//		System.out.print(al1.removeRange(300,100));
		System.out.println(al1.getClass());
		System.out.println(al1.set(2, 200));
		System.out.println(al1);
		System.out.println(al1.toArray());
		System.out.println(al1.parallelStream());
		System.out.println(al1.spliterator());
		System.out.println(al1.stream());
		System.out.println(al1.subList(2, 4));
		System.out.println(al1.subList(1, 4));
		al1.ensureCapacity(20);
		System.out.println(al1);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(50);
		System.out.println(al1);
		System.out.println(al2.isEmpty());
		al2.clear();
		System.out.println(al2.isEmpty());
		System.out.println(al1.equals(al));
		
	}
}
