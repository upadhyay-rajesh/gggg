package com.facebookweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nm");
		String password=request.getParameter("pass");
		String email=request.getParameter("em");
		String address=request.getParameter("ad");
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		out.println("<html><body>");
				out.println("Name is "+name);
				out.println("<br>Password is "+password);
				out.println("<br>Email is "+email);
				out.println("<br>Address is "+address);
		out.println("</body></html>");
	}

}
