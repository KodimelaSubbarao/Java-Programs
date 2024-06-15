
package com.sa.jdbc;
import java.util.Scanner;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class  CopyData
{
	private static final String ORA_SELECT_QUERY="SELECT * FROM PRODUCT";
	private static final String MYSQL_INSERT_QUERY="INSERT INTO PRODUCT VALUES(?,?,?,?)";
	public static void main(String[] args) 
	{
		
		try(
			Connection oraCon=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-08IIGEE:1521:XE","c##subbu","subbu");
			Connection mySqlCon=DriverManager.getConnection("jdbc:mysql:///subbu","root","Subbu@123");
			PreparedStatement ps1=oraCon.prepareStatement(ORA_SELECT_QUERY);
			PreparedStatement ps2=mySqlCon.prepareStatement(MYSQL_INSERT_QUERY);
			)
		{
			try(ResultSet rs=ps1.executeQuery();)
			{
				int count=0;
				while(rs.next())
				{
					ps2.setString(1,rs.getString(1));
					ps2.setString(2,rs.getString(2));
					ps2.setFloat(3,rs.getFloat(3));
					ps2.setInt(4,rs.getInt(4));
					count=ps2.executeUpdate();
				}
				if(count>0)
					System.out.println(count+"records inserted...");
				else
					System.out.println(count+"records not inserted...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
