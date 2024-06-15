
package com.sa.servlet;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class  DateServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		Date d=new Date();
		pw.println("<h1 style='color:red;text-align:center'>"+d+"</h1>");

		pw.close();
	}
}
