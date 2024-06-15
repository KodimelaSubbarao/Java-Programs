package HandlingFiles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferStreams 
{
	//Buffered Byte Streams
	void BufferedByteStreams1() throws Exception
	{		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("sa.txt"));
		int i;
		while((i=bis.read())!=-1)
			System.out.print((char)i);
		bis.close();
	}
	void BufferedByteStreams2() throws Exception
	{
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("sa11.txt"));
		String s="Java is Object Oriented Programming Language";
		byte arr[]=s.getBytes();
		bos.write(arr);
		bos.close();
	}
	void BufferedByteStreams3() throws Exception
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("sa11.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("sa22.txt"));
		int i;
		while((i=bis.read())!=-1)
			bos.write(i);
		bis.close();
		bos.close();
	}
	
	//main
	public static void main(String[] args) throws Exception
	{
		BufferStreams bs=new BufferStreams();
		bs.BufferedByteStreams1();
		bs.BufferedByteStreams2();
		bs.BufferedByteStreams3();
		bs.BufferedCharacterStreams1();
		bs.BufferedCharacterStreams2();
		bs.BufferedCharacterStreams3();
	}
	
	//Buffered Character Streams
	void BufferedCharacterStreams1() throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("sa11.txt"));
		int i;
		while((i=br.read())!=-1)
			System.out.print((char)i);
		br.close();
	}
	void BufferedCharacterStreams2() throws Exception
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("sa12.txt"));
		String s="HTML is a Hyper Text Markup Language";
		bw.write(s);
		bw.close();
	}
	void BufferedCharacterStreams3() throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("sa12.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("sa13.txt"));
		int i;
		while((i=br.read())!=-1)
			bw.write(i);
		br.close();
		bw.close();
	}
}
