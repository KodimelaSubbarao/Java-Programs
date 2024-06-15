package com.sa.jdbc;
import java.sql.*;
import java.util.*;

public class PSInsert
{
	private final static String query="INSERT INTO STUDENT VALUES(?,?,?,?)";
	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-08IIGEE	:1521:XE","System","subbu");
			Statement smt=con.createStatement();
			PreparedStatement ps=con.prepareStatement(query);)
		{
			if(smt!=null)
			{
				smt.executeUpdate("drop table student");
				int a=smt.executeUpdate("create table student(sid number(4),sname varchar2(10),saddresss varchar2(10),savg number(4,2))"); 
				if(a==0)
					System.out.println("Table Created");
				else
					 System.out.println("Table Not Created");
			}
			int count=0;
			if(sc!=null)
			{
				System.out.println("Enter the Student count::");
				count=sc.nextInt();
			}
			if(sc!=null && con!=null)
			{
				for(int i=1;i<=count;i++)
				{
					System.out.println("Enter the student "+i+" data ::");
					System.out.print("Enter Studnet id :: ");
					int id=sc.nextInt();
					System.out.print("Enter Studnet Name :: ");
					String name=sc.next();
					System.out.print("Enter Studnet Address :: ");
					String addr=sc.next();
					System.out.print("Enter Studnet Average :: ");
					float avg=sc.nextFloat();
					
					ps.setInt(1,id);
					ps.setString(2,name);
					ps.setString(3,addr);
					ps.setFloat(4,avg);

					int r=ps.executeUpdate();
					if(r==0)
						System.out.println("Record Nor Inserted.....");
					else
						System.out.println("Record Inserted.....");

				}
			}
		}
		catch(SQLException se){se.printStackTrace();}
		catch(Exception e){e.printStackTrace();}
		
	}
}
