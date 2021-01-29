package com.training.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCookieServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Get cookies form header of HTTP request
		Cookie[] cookies = req.getCookies();
		// Display these cookies
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<B>");
		for (int i = 0; i < cookies.length; i++) {
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			pw.println("name : "+name+" value : "+value);
		}
		pw.close();
	}

}
