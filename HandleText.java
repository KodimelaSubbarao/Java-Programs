package FileHandling;

import java.io.BufferedReader;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

public class HandleText 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("./Sample.txt");
		if(!f.exists())
			f.createNewFile();
		
	/*	1.CASE-1 FILEINPUTSTREAM CLASS
	    FileInputStream fis=new FileInputStream(f);
		int i;
		//String s=new String();
		while((i=fis.read())!=-1)
		{
			//s+=(char)i;
			//s+=String.valueOf((char)i);
			System.out.print((char)i);
		}
		//System.out.println(s);
		
	
		2.CASE-2 SCANNER CLASS
		//Scanner sc=new Scanner(fis);
		Scanner sc=new Scanner(f);
		//while(sc.hasNextLine())
		while(sc.hasNext())
			//System.out.println(sc.next());
			System.out.println(sc.nextLine());
		sc.close();
	
		fis.close();
	
		3.CASE-3 FILEREADER CLASS
		FileReader fr=new FileReader(f);
		int i;
		String s1=new String();
		while((i=fr.read())!=-1)
		{
			//s1+=(char)i;
			s1+=String.valueOf((char)i);
			System.out.print((char)i);
		}
		System.out.println(s1);
		
		4.CSAE-4 BUFFEREDREADER CLASS
		
	
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int i;
		String s=new String();
		while((i=br.read())!=-1)
		{
			s +=String.valueOf((char)i);
		}
		System.out.println(s);
	*/
		//this is using readLine() method , it is end of text print null
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=new String();
		String s1=new String();
		while((s=br.readLine())!=null)
		{
			s1 +=s+"\n";
			//System.out.println(s);
		}
		System.out.print(s1);
		fr.close();
		br.close();
	}
	
		
}
