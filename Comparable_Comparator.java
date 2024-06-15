package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable_Comparator 
{
	void meth1()
	{
		ArrayList<ComparableClass> al=new ArrayList<ComparableClass>();
		al.add(new ComparableClass("Subbu",101,"Java"));
		al.add(new ComparableClass("Anu", 105, "Python"));
		al.add(new ComparableClass("Usha", 102, "Sql"));
		al.add(new ComparableClass("King", 104, "Html"));
		al.add(new ComparableClass("Ram", 103, "Js"));
		Iterator<ComparableClass> i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("\n");
		Collections.sort(al);
		Iterator<ComparableClass> i2=al.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	void meth2()
	{
		ArrayList<ComparatorPorgeClass> al=new ArrayList<ComparatorPorgeClass>();
		al.add(new ComparatorPorgeClass("Subbu",101,"Java"));
		al.add(new ComparatorPorgeClass("Anu", 105, "Python"));
		al.add(new ComparatorPorgeClass("Usha", 102, "Sql"));
		al.add(new ComparatorPorgeClass("King", 104, "Html"));
		al.add(new ComparatorPorgeClass("Ram", 103, "Js"));
		Iterator<ComparatorPorgeClass> i1=al.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("\n");
		Collections.sort(al,new ComparatorClass());
		Iterator<ComparatorPorgeClass> i2=al.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}
	public static void main(String[] args) 
	{
		new Comparable_Comparator().meth2();
	}
}
