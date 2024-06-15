package com.sa.jdbc;
import java.util.Scanner;
import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TxMgmtTest 
{
	public static void main(String[] args) 
	{
		try(	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost","system	","subbu");
				Statement smt=con.createStatement();)
		{
					con.setAutoCommit(false);
		if(smt!=null)
		{
			smt.addBatch("insert into employee values(1020,'Rama','JFD',32466.00)");
			smt.addBatch("insert into employee values(1030,'Seetha','PFD',27500.00)");
			smt.addBatch("update employee set ejob='java' where ejob='SE'");
			smt.addBatch("update employee set esal=20000.00 where  empid=102");
			smt.addBatch("delete  from employee where empid=101");

			int[] result=smt.executeBatch();
			boolean flag=true;
			for(int i=0;i<result.length;i++)
			{
				if(result[i]==0){
					flag=false;
					break;
				}
			}
			if(flag){
				con.commit();
				System.out.println("Transactions commited");
			}
			else{
				con.rollback();
				System.out.println("Transactions rollback");
			}
		}
	}
	catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
