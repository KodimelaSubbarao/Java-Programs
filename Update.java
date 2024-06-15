package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Update 
{
	public static void main(String[] args) throws IOException
	{
		//first read the text
		File f=new File("./sa.txt");
		File f1=new File("./Sample.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String s2=new String();
		String s=new String();
		while((s=br.readLine())!=null)
		{
			s2 +=s;
			System.out.println(s2);
		}
		BufferedReader br1=new BufferedReader(new FileReader(f1));
		String s4=new String();
		String s3=new String();
		while((s3=br.readLine())!=null)
		{
			s4 +=s3;
			System.out.println(s4);
		}
		//String s1="I did my Graduation";
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(s2+s4);
		
		br.close();
		br1.close();
		bw.close();
	}
}
