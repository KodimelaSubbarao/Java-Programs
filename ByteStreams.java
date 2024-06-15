package HandlingFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStreams 
{
	void read1() throws Exception
	{
//		FileInputStream fis=new FileInputStream("sa.txt");		
		FileInputStream fis=new FileInputStream("E:\\Java\\Notes\\Multi-Threading Questions.txt");
		int i;
		while((i=fis.read())!=-1)
			System.out.print((char)i);
		fis.close();
	}
	void read2() throws Exception
	{
//		FileInputStream fis=new FileInputStream("E:\\Java\\Assignmet.jpg");
		FileInputStream fis=new FileInputStream("E:\\Java\\Notes\\oops encapsulation.pdf");
		
		int i;
		while((i=fis.read())!=-1)
			System.out.print((char)i);
		fis.close();
		
	}
	void write1() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("newSa.txt");
		String s="Hello EveryOne, Welcome to My Java Program.Java is Awesome";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
	void write2() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("newSa.txt",true); //append the data into existing file
		String s="I love Me";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
	void copy1() throws Exception
	{
		FileInputStream fis=new FileInputStream("sa.txt");
		FileOutputStream fos=new FileOutputStream("newSa.txt",true);
		int i;
		while((i=fis.read())!=-1)
			fos.write(i);
		fos.close();
		fis.close();
	}
	void copy2() throws Exception
	{
		//FileInputStream fis=new FileInputStream("E:\\Java\\Notes\\arrays.png");
//		FileInputStream fis=new FileInputStream("E:\\Java\\shiva.jpg");
//		FileInputStream fis=new FileInputStream("E:\\Java\\dp.jpeg");
//		FileInputStream fis=new FileInputStream("E:\\Java\\Notes.txt");
		FileInputStream fis=new FileInputStream("E:\\Java\\pic.png");
		FileOutputStream fos=new FileOutputStream("pic.png");
		int i;
		while((i=fis.read())!=-1)
			fos.write(i);
		System.out.println("copied");
		fos.close();
		fis.close();
	}
	void concat1() throws Exception
	{
		FileInputStream fis=new FileInputStream("Sample.txt");
		FileOutputStream fos=new FileOutputStream("Sample.txt");
		int i;
		String s="Hi, ";
		String s1="Hello Friends";
		while((i=fis.read())!=-1)
		{
			s1+=(char)i;
			
		}
		System.out.println(s1);
		byte arr[]=s1.getBytes();
		fos.write(arr);
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		ByteStreams obj=new ByteStreams();
		//obj.read1();
		//obj.write2();
		obj.concat1();
	}
}
