package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletDemo")
public class HttpServletDemo extends HttpServlet //Its totally Protocol Dependent So Only Http Request can Accept to Driver.
{
	private static final long serialVersionUID = 1L; 
    public HttpServletDemo()
    {
    	//Default Constructor
        super();    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//except Service phase here only doGet() method available for taking the request from the Client Browser.
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("I am in Get Method of Http Servlet");	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//except Service phase here only doPost() method available for sending the request to the Client Browser in secured manner.
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("I am in Post Method of Http Servlet");
	}

}
