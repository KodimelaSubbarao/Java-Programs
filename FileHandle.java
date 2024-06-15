package FileHandling;

//import java.io.File;


import java.io.IOException;

//import java.sql.Date;

//import java.util.Arrays;

public class FileHandle 
{
	static void meth1() throws IOException
	{
	//	File f=new File("E:\\Java\\Programs");
		
	//	f.mkdirs();//create multiple directory or Folder
	//	f.mkdir(); //create one directory or Folder
		
	/*	System.out.println(f.exists()); //check file or folder available or not 
		System.out.println(f.createNewFile()); //create new file with different name
		System.out.println(f.delete()); //delete file or Folder 
	*/
		
	/*	if(f.exists())
			f.delete();
		System.out.println(f.createNewFile());
	*/
		
     /* 	System.out.println(f.canWrite()); //check the file say can we write or not 
		System.out.println(f.setWritable(true)); //set the file for writable file or readonly option remove  
		System.out.println(f.isHidden()); // check the file is hide or not
	*/
		
	/*  System.out.println(f.getName());//get the you created file name
		System.out.println(f.getAbsolutePath()); //get the full path of created file
		System.out.println(f.getParent()); //get the file create or present folders path only
	*/
	
	//	File f2=new File(f.getParent()+"\\Sa.docx"); //folder path used to creating a file
	//	f2.createNewFile();  
	
	//	System.out.println(f.lastModified()); //it is used to display long formated of date
	//	System.out.println(new Date(f.lastModified())); 
	/*	
		System.out.println(f.list());//it is display string array format
		System.out.println(Arrays.toString(f.list())); // string array is convert to String 
		
		System.out.println(f.listFiles());//it is used to display full path of the files in String Array format
		System.out.println(Arrays.toString(f.listFiles())); //it is used to display full path of the files in String Array format is converted to String
		
		System.out.println(f.isFile()); //check the we are created file or not
		System.out.println(f.isDirectory()); //check the we are created directory or not
	*/
	}
	public static void main(String[] args) throws IOException 
	{
		meth1();
	}

}
