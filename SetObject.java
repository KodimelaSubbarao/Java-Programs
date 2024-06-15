package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetObject 
{
	void hashset()
	{
		HashSet<Object1> hs=new HashSet<Object1>();
		hs.add(new Object1(101, "Subbu", "JAVA"));
		hs.add(new Object1(102, "Raja", "PYTHON"));
		hs.add(new Object1(103, "Ram", "HTML"));
		hs.add(new Object1(104, "Tharun", "SQL"));
		System.out.println(hs);
	}
	void linkedhashset()
	{
		LinkedHashSet<Object1> lhs=new LinkedHashSet<Object1>();
		lhs.add(new Object1(1001, "Suresh", "MCA"));
		lhs.add(new Object1(1002, "Hari", "B.Tech"));
		lhs.add(new Object1(1003, "Gopal", "Diploma"));
		lhs.add(new Object1(1004, "Srinu", "IT"));
		System.out.println(lhs);
	}
	void treeset()
	{
		TreeSet<Object1> ts=new TreeSet<Object1>();
		ts.add(new Object1(201, "KSR", "Maths"));
		ts.add(new Object1(1002, "SA", "Telugu"));
		ts.add(new Object1(1003, "KA", "English"));
		ts.add(new Object1(1004, "JFS", "Hindhi"));
		System.out.println(ts);
	}
	public static void main(String[] args) 
	{
		SetObject so=new SetObject();
		so.hashset();
		so.linkedhashset();
		so.treeset();
	}

}
