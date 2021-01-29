package com.training.session;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeUser extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			HttpSession session = request.getSession(false);
			String myName = (String) session.getAttribute("uname");
			String myPass = (String) session.getAttribute("upass");
			pwriter.print("Name: " + myName + "<br>Pass: " + myPass);
			pwriter.close();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}