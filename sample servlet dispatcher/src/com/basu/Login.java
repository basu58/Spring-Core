package com.basu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String u=request.getParameter("userName");
		String p=request.getParameter("userPass");
		
		if(u.equals("basu")) {
			if(p.equals("basu")) {
				RequestDispatcher rd=request.getRequestDispatcher("servlet2");
				rd.forward(request, response);
			}
			else {
				out.print("<h3>Invalid user/password...</h3>");
				RequestDispatcher rd=request.getRequestDispatcher("/input.html");
				rd.forward(request, response);
			}
		}
		else {
			out.print("<h3>Invalid user/password...</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("/input.html");
			rd.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
