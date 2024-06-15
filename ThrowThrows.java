package Exception;

import java.io.FileReader;

public class ThrowThrows 
{
	int ammount=1000;
	void Throw(int withdraw)
	{
		if(ammount<withdraw)
			throw new ArithmeticException("Insufficient Balance...!");
		else
			System.out.println("Please take your amount "+withdraw);
	}
	void Throws() throws Exception
	{
		FileReader fr=new FileReader(".\sa.txt");
		fr.close();
		System.out.println("File Read Successful");
	}
	public static void main(String[] args) throws Exception
	{
		//new ThrowThrows().Throw(2000);
		new ThrowThrows().Throws();
	}
}
