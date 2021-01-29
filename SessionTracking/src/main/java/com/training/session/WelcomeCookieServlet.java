package com.training.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeCookieServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		//Get Parameter from HTTP request
		String data = req.getParameter("data");
		//Create cookie 
		Cookie cookie = new Cookie("MyCookie", data);
		//Add cookie to Http response
		res.addCookie(cookie);
		//Write output to browser
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<B>MyCookie has been set to");
		pw.println(data);
		pw.close();
		
	}

}
