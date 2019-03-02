package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GenericServletDemo")
public class GenericServletDemo extends GenericServlet 
{
	private static final long serialVersionUID = 1L;
        
    public GenericServletDemo() //Default Constructor
    {
    	super();
    	System.out.println("I am in Default Constructor in GenericServletDemo");     
    }
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		//This is only the Main Method in in GenericServlet Class work same as Servlet Interface Service Method.
		//That means its also take the request from Client Browser and send the request to the Client Browser Again.
		
		System.out.println("I am in Service Method of GenericServlet Demo ");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.println("Hi you are in GenericServletDemo in Dynamic Web Project extends GenericServlet, second web project");
		
	}

}
