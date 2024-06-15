package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

public class MapInterface1
{
	void hashmap()
	{
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		map.put(101, "Java"); //insertion order not maintained
		map.put("Java", "Java");//heterogeneous allowed key and value
		map.put(102, 102);//Duplicates are allow only values 
		map.put(null, null);//null allow key and value
		map.put('c', "sql");//available in java 1.2V
		map.put(true, "html");// default size is 16
		map.put(103, "css");// size increase by double
		map.put(104, "sa");//not synchronized
		map.put(105, false);
		System.out.println(map);
		map.put(103, "js");
		System.out.println(map);
		System.out.println("clone() : "+map.clone());
		System.out.println("containsKey() : "+map.containsKey(103));
		System.out.println("containsValue() : "+map.containsValue("sa"));
		System.out.println("equals() : "+map.equals(new Object()));
		System.out.println("getOrDefault(key, default) : "+map.getOrDefault(106, 'S'));
		System.out.println(map.isEmpty());
		System.out.println(map.putIfAbsent("Java", 101));
		System.out.println(map);
		System.out.println(map.remove(null));
		System.out.println(map);
		System.out.println(map.remove(102, 102));
		System.out.println(map);
		System.out.println(map.replace("Java", "Kishan"));
		System.out.println(map);
		System.out.println(map.replace(104, "sa", "KSR"));
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.toString());
		System.out.println(map.getClass());
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map);
		System.out.println("\n");
		ArrayList<Object> al =new ArrayList<Object>(map.keySet());
		Iterator<Object> i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
			//System.out.println(map.get(i.next()));
			
		}
		ArrayList<Object> al1 =new ArrayList<Object>(map.entrySet());
		Iterator<Object> i1=al1.iterator();
		while(i1.hasNext())
		{
			//System.out.print(i1.next());
			//System.out.println(map.get(i1.next()));
			Entry<Object, Object> e=(Entry)i1.next();
			System.out.println(e.getKey()+" >>>>> "+e.getValue());
			
		}
		
	}
	void linkedhashmap()
	{
		LinkedHashMap<Object, Object> map=new LinkedHashMap<Object, Object>();
		map.put(101, "Java"); //insertion order  maintained
		map.put("Java", "Java");//heterogeneous allowed key and value
		map.put(102, 102);//Duplicates are allow only values 
		map.put(null, null);//null allow key and value
		map.put('c', "sql");//available in java 1.4V
		map.put(true, "html");// default size is 16
		map.put(103, "css");// size increase by double
		map.put(104, "sa");//not synchronized
		map.put(105, false);
		System.out.println(map);
		map.put(103, "js");
		LinkedList<Object> ll=new LinkedList<Object>(map.keySet());
		ListIterator<Object> li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" ");
		}
		
//		System.out.println(map);
//		System.out.println("clone() : "+map.clone());
//		System.out.println("containsKey() : "+map.containsKey(103));
//		System.out.println("containsValue() : "+map.containsValue("sa"));
//		System.out.println("equals() : "+map.equals(new Object()));
//		System.out.println("getOrDefault(key, default) : "+map.getOrDefault(106, 'S'));
//		System.out.println(map.isEmpty());
//		System.out.println(map.putIfAbsent("Java", 101));
//		System.out.println(map);
//		System.out.println(map.remove(null));
//		System.out.println(map);
//		System.out.println(map.remove(102, 102));
//		System.out.println(map);
//		System.out.println(map.replace("Java", "Kishan"));
//		System.out.println(map);
//		System.out.println(map.replace(104, "sa", "KSR"));
//		System.out.println(map);
//		System.out.println(map.size());
//		System.out.println(map.toString());
//		System.out.println(map.getClass());
//		System.out.println(map.entrySet());
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map);
//		System.out.println("\n");
//		ArrayList<Object> al =new ArrayList<Object>(map.keySet());
//		Iterator<Object> i=al.iterator();
//		while(i.hasNext())
//		{
//			System.out.print(i.next());
//			//System.out.println(map.get(i.next()));
//			
//		}
//		ArrayList<Object> al1 =new ArrayList<Object>(map.entrySet());
//		Iterator<Object> i1=al1.iterator();
//		while(i1.hasNext())
//		{
//			//System.out.print(i1.next());
//			//System.out.println(map.get(i1.next()));
//			Entry<Object, Object> e=(Entry)i1.next();
//			System.out.println(e.getKey()+" >>>>> "+e.getValue());
//			
//		}
//		
	}
	
	public static void main(String[] args) 
	{
		MapInterface1 mi=new MapInterface1();
		mi.linkedhashmap();
	}
}
