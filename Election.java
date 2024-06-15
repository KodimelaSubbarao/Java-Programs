package com.nary;

import java.util.HashMap;

//import java.util.Map;
import java.util.Scanner;

public class Election {
	
	static Scanner sc=new Scanner(System.in);
static	void vote(int total_Voters)
	{
		System.out.println("\nAvailable Parties is TDP, YCP, BJP, TRS and Others");
	int p=0;
		int q=0;
		int r=0;
		int s=0;
		int t=0;
		int b=1;
		while(total_Voters>=b)
		{
			System.out.print("\nEnter Your Party Name for Vote: ");
			String name=sc.next();
			String s1=name.strip().toUpperCase();
			switch(s1)
			{
				case "TDP":
					p++;
					break;
				case "YCP":
					q++;
					break;
				case "BJP":
					r++;
					break;
				case "TRS":
					s++;
					break;
				default:
					t++;
					break;
						
			}
			b++; 
		}
		HashMap<String, Integer> map = new HashMap<>();
		map.put("tdp",p);
		map.put("ycp", q);
		map.put("bjp", r);
		map.put("Brs", s);
		map.put("nota", t);
		System.out.println(map);
	}

////int maxVotes =Math.max(Math.max(p, q), Math.max(r, Math.max(s, t)));
///
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("tdp", p);
//		map.put("ycp", q);
//		map.put("bjp", r);
//		map.put("Brs", s);
//		map.put("nota", t);
//		//System.out.println(map);
//		/*
//		 * Optional<Entry<String, Integer>> max =
//		 * map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
//		 * if(max.isPresent()) { Entry<String, Integer> entry = max.get();
//		 * System.out.println("winner is "+entry.getKey()+"="+entry.getValue() ); }
//		 */
//		
//}
//int findmaxValue(){
//	return 0;
//	
//} */
/*
	    if (p == maxVotes && q == maxVotes && r == maxVotes && s == maxVotes && t == maxVotes) {
	        System.out.println("\n ALL Party Got equal Votes");
	    }
	    else if (q == maxVotes && r == maxVotes && s == maxVotes && r == maxVotes) {
	        System.out.println("\nYCP, BJP ,TRS and other Party Got equal Votes");
	    }
	    else if (r == maxVotes && s == maxVotes && r == maxVotes) {
	        System.out.println("\nBJP, TRS and Other Party Got equal Votes");
	    }
	    else if (s == maxVotes && r == maxVotes) {
	        System.out.println("\nTRS and Other Party Got equal Votes");
	    }
	    else if (t == maxVotes) {
	        System.out.println("\nOther Party Got Highest Votes");
	    }
	    else
	    */
/*
* if (p > q && p > r && p > s && p > t) { if (p == maxVotes && q == maxVotes &&
* r == maxVotes && s == maxVotes && t == maxVotes) {
* System.out.println("\n ALL Party Got equal Votes"); } else {
* System.out.println("\nTDP Party Got Highest Votes"); } } else if (q > r && q
* > s && q > t) { if (q == maxVotes && r == maxVotes && s == maxVotes && r ==
* maxVotes) {
* System.out.println("\nYCP, BJP ,TRS and other Party Got equal Votes"); } else
* { System.out.println("\nYCP Party Got Highest Votes"); } } else if (r > s &&
* r > t) { if (r == maxVotes && s == maxVotes && r == maxVotes) {
* System.out.println("\nBJP, TRS and Other Party Got equal Votes"); } else {
* System.out.println("\nBJP Party Got Highest Votes"); } } else if (s > t) { if
* (s == maxVotes && r == maxVotes) {
* System.out.println("\nTRS and Other Party Got equal Votes"); } else {
* System.out.println("\nTRS Party Got Highest Votes"); } } else { if (t ==
* maxVotes) { System.out.println("\nOther Party Got Highest Votes"); } }
*/
	
	/*if(p>q)
		if(p>q)
			if(p>r)
				if(p>s)
					if(p>t)
						System.out.println("\nTDP Party Got Highest Votes");		
					else
						System.err.println("TDP and Other parties got a equal votes");
				else
					System.err.println("TDP and TRS Party got a equal votes");
			else
				System.err.println("TDP, and BJP Parties got a equal votes");
		else
			System.err.println("TDP and YCP Parties got a equal votes");
	
	else if(q>r)
		if(q>r)
			if(q>s)
				if(q>t)
					System.out.println("\nYCP Party Got Highest Votes");
				else
					if(!(q>s && q>r))
					System.err.println("YCP and Other Party got a equal votes");		
			else
				System.err.println("YCP and TRS Party got a equal votes");
		else
			System.err.println("YCP and BJP Party got a equal votes");
	
	else if(r>s)
		if(r>s)
			if(r>t)
				System.out.println("\nBJP Party Got Highest Votes");	
			else
				System.err.println("BJP and Other Party got a equal votes");
		else
			System.err.println("BJP and TRS Party got a equal votes");
	else if(s>t)
		if(s>t)
			System.out.println("\nTRS party Got Highest Votes");
		else
			System.err.println("TRS and Other Party got a equal votes");
	else
		System.out.println("\nOther Party Got Highest Votes");
		
		if(p>q && p>r && p>s && p>t)
			if(p>q)
			System.out.println("TDP win");
			else
				System.out.println("yscp win");
		else if(q>=r && q>=s && q>=t)
			System.out.println("YCP win");
		else if(r>=s && r>=t)
			System.out.println("BJP win");
		else if(s>=t)
			System.out.println("TRS win");
		else
			System.out.println("others win");
}*/
		/*
		 * Optional<Entry<String, Integer>> max =
		 * map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
		 * if(max.isPresent()) { Entry<String, Integer> entry = max.get();
		 * System.out.println("winner is "+entry.getKey()+"="+entry.getValue() ); }
		 */
		/* int valueOccurrences=-1;
		
		 for (int value : map.values()) {
	            valueOccurrences.put(value, valueOccurrences.getOrDefault(value, 0) + 1);
	        }

	        int maxDuplicateValue = -1; // Initialize to an invalid value
	        int maxOccurrences = 1; // Initialize to 1, as every value occurs at least once

	        // Iterate through the occurrences map to find the maximum duplicate value
	        for (Map.Entry<Integer, Integer> entry : valueOccurrences.entrySet()) {
	            if (entry.getValue() > maxOccurrences) {
	                maxOccurrences = entry.getValue();
	                maxDuplicateValue = entry.getKey();
	            }
	        }

	        // Print the result
	        if (maxDuplicateValue != -1) {
	            System.out.println("Maximum duplicate value in the map: " + maxDuplicateValue +
	                               " (occurs " + maxOccurrences + " times)");
	        } else {
	            System.out.println("No duplicate values found in the map.");
	        }
	    }
		*/

	public static void main(String[] args) {
		Election.vote(sc.nextInt());
		
	}
	
	




}
