package com.sa.jdbc;
import java.util.Scanner;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class BatchUpdate 
{
	public static void main(String[] args) 
	{
		try(	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost","system	","subbu");
				Statement smt=con.createStatement();)
		{
		if(smt!=null)
		{
			smt.addBatch("insert into employee values(1010,'sa','java f',78.3)");
			int[] i=smt.executeBatch();
			System.out.println(java.util.Arrays.toString(i));
		}
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
