package HandlingFiles;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams 
{
	void reading() throws Exception
	{
		FileReader fr=new FileReader("sa12.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		System.out.println();
		fr.close();
	}
	void writing() throws Exception
	{
		FileWriter fw=new FileWriter("sa14.txt");
		String s="SQL is a Structure Qurey Language";
		fw.write(s);
		fw.close();
	}
	void coping() throws Exception
	{
		FileReader fr=new FileReader("sa14.txt");
		FileWriter fw=new FileWriter("sa15.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			fw.write(i);
		}
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		CharacterStreams obj=new CharacterStreams();
		obj.reading();
		obj.writing();
		obj.coping();
	}
}
