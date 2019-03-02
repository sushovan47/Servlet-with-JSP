package com.sushovan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HttpServletDemoRequestDispatch")
public class HttpServletDemoRequestDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println();
		String s1=request.getParameter("username");
		String s2=request.getParameter("password");
		if(s1.equals("sushovan"))
		{
			RequestDispatcher disp=request.getRequestDispatcher("Success.jsp");
			disp.forward(request, response);
		}
		else
		{
			pw.println("OOps!! You are entering Wrong Userid or Password Please Check and Sign in Again..Soorry!!!!"+s2);
		}
		
		
		
	}
}
