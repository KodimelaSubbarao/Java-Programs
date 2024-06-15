package Tasks;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;
public class CollectionList 
{
	LinkedList<String> meth1(ArrayList<Object> al,Vector<Integer> v)
	{
		for(int i=0;i<al.size();i++)//Forward Direction
		{ System.out.print(al.get(i)+" "); }
		System.out.println();
		for(int i=al.size()-1;i>=0;i--)//Backward Direction
		{ System.out.print(al.get(i)+" "); }
		System.out.println("\n");
		Enumeration<Integer> e=v.elements(); //Using Enumeration
		while(e.hasMoreElements())
		{ System.out.print(e.nextElement()+" "); }
		System.out.println("\n");
		LinkedList<ClassB> ll2=new LinkedList<ClassB>();
		ll2.add(new ClassB(101,"Java"));
		ll2.add(new ClassB(102,"Python"));
		ll2.add(new ClassB(103,"SQL"));
		//Using ListIterator
		ListIterator<ClassB> li=ll2.listIterator();	
		while(li.hasNext())//Forward Direction
			{ System.out.print(li.next()+" "); }
		System.out.println();
		while(li.hasPrevious())//Backward Direction
		{ System.out.print(li.previous()+" "); }
		System.out.println("\n");
		LinkedList<String> lls=new LinkedList<String>();
		lls.add("JAVA"); lls.add("PYTHON");
		lls.add("SQL"); lls.add("HTML");
		lls.add("CSS"); lls.add("JAVASCRIPT");
		return lls;
	}
	public static void main(String[] args) 
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(479); al.add("RAJ"); al.add("RAM");
		al.add(479); al.add(null); al.add('A');
		Vector<Integer> v =new Vector<Integer>();
		v.add(1); v.add((Integer)al.get(0));
		v.add(101);v.add(null); v.add(1);
		CollectionList cl=new CollectionList();
		//System.out.println(cl.meth1(al, v));
		Iterator<String> i=cl.meth1(al, v).iterator();
		while(i.hasNext()) //retrieve the elements
		{ System.out.print(i.next()+" "); }
	}
}
