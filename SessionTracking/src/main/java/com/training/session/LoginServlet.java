package com.training.session;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();

			String name = request.getParameter("userName");
			String password = request.getParameter("userPassword");
			pwriter.print("Hello " + name);
			//pwriter.print("Your Password is: "+password);
			HttpSession session = request.getSession();
			session.setAttribute("uname", name);
			session.setAttribute("upass", password);
			pwriter.print("<a href='welcome'> view details</a>");
			pwriter.close();
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}
}