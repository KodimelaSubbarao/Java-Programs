package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("./sa.txt");
		if((f.exists()))
			f.delete();
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		//fos.write(69);
		String s="hello world";
		for(char c:s.toCharArray())
			fos.write((int)c);
		fos.close();
	
		FileWriter fw=new FileWriter(f);
		String s1="Kodimela Subbarao,I am From Palnadu";
		fw.write(s1);
		fw.close();
	
		FileWriter fw1=new FileWriter(f);
		String s2="Kodimela Subbarao,I am From Palnadu";
		BufferedWriter bw=new BufferedWriter(fw1);
		bw.write(s2);
		
		bw.close();
		fw.close();
	}

}
