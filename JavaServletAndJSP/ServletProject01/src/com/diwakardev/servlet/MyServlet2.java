package com.diwakardev.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out =res.getWriter();
		//print.println("req:"+req.getQueryString());
		
		//Cookie:start
		Cookie cookies[]   = req.getCookies();
		
		for(int i = 0 ; i<cookies.length; i++)
			out.println("Creq: name"+cookies[i].getName()+", Value :"+cookies[i].getValue());
		
		//Cookie:end
		
		//Servlet COntext:start
		ServletContext ctx = getServletContext();//req.getServletContext()
		out.println("Servlet Context 1:"+ctx.getInitParameter("Name"));
		out.println("Servlet Context2 :"+ctx.getInitParameter("WIFE"));
		//Servlet COntext:end
		
		//Servlet Config:start
		ServletConfig config = getServletConfig();
		out.println("Servlet CONFIG 1:"+config.getInitParameter("Name1"));
		
		//Servlet Config:end
		
	}
}
