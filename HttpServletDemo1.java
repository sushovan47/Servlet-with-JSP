package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletDemo1")
public class HttpServletDemo1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("I am in Get Method"+"<br/>");
		String uname=request.getParameter("USERNAME");
		String pawrd=request.getParameter("PASSWORD");
		
		pw.println("User Name:"+uname+"<br/>");
		pw.println("Password:"+pawrd+"<br/>");
		
		if(uname.equals("sushovan47")&&pawrd.equals("12345"))
		{
			pw.println("Login Successful..."+uname);
		}
		else
		{
			pw.println("Invalid User Name or Password");
		}
		
		
	}
}
