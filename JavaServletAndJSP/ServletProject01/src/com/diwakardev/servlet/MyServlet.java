package com.diwakardev.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyServlet extends HttpServlet {

//	// TODO only for Get Method
//	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
//		System.out.println("reqParam in DoPost:"+req.getQueryString());
//		String num1 = req.getParameter("num1");
//		String num2 = req.getParameter("num2");
//		req.setAttribute("ResultByDoGET", "num1:"+num1+",num2"+num2 );
//		rep.sendRedirect("myservlet2");
//	}
	
	
//	// TODO only for Post Method
//	public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
//		System.out.println("reqParam:"+req.getQueryString());
//		String num1 = req.getParameter("num1");
//		String num2 = req.getParameter("num2");
//		RequestDispatcher reqD =   req.getRequestDispatcher("myservlet2");
//		req.setAttribute("ResultbyDOPOST", "num1:"+num1+",num2"+num2 );
//		reqD.forward(req, rep);
//
//	}
//
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("reqParam:"+req.getQueryString());
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");

		// using cookie 
		Cookie cookie =  new Cookie("Cookie1", " Cookie Result num1:"+num1+",num2"+num2 );
		res.addCookie(cookie);
		
		
		// using requestdispatcher
		RequestDispatcher reqD =   req.getRequestDispatcher("myservlet2");
		HttpSession session =  req.getSession(false); // If the request has no session then return null ;
		req.setAttribute("Result", "num1:"+num1+",num2"+num2 );
		reqD.forward(req, res);
	}
	
}
