package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ServletDemo")
public class ServletDemo  implements Servlet
{
    public ServletDemo() 
    {
    	System.out.println("Hi you are in Default Constructor ");
       //Default Constructor Which is basically not Used in Servlet Interface
    }
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("Hi you are in Init Phase ");
		//Step-->1 init() phase Which is used for initialization the SErvlet,here Servlet instance will be loaded. 
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	//Step-->2 service() phase take the request and send the request to the client browser,actually this method is main method in Servlet Interface.
		
		System.out.println("Hi you are in Service Method ");
		response.setContentType("text/html"); 	 //Client Browser just send the Request to the Server.
		
		PrintWriter pw=response.getWriter();	//Client Browser just receive the Request from the Server.
		pw.println("Hi You are in ServletDemo in Dynamic Web Project implements Servlet,First Web Project "); 
		//You can see in Web Browser.
		
	}
	public void destroy()
	{
		System.out.println("Hi you are in Destroy Method ");
		//Step--->3 destroy() phase when Servlet is no more needed,just before Servlet remove from Container this method will be called.
	}
	public ServletConfig getServletConfig() 
	{
		System.out.println("Hi you are in Configuration Method ");
		//Step--->4 Config() phase is not very much useful in Servlet, just carry the Configuration of Servlet.
		return null;
	}
	public String getServletInfo()
	{
		System.out.println("Hi you are in Servlet Information Method ");
		//Step-->4 Info() phase is calling when we need the basic Inforamtion about Servlet this is used like version,copyright,etc.
		return null; 
	}
	

}
