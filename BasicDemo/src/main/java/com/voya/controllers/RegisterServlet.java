package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String city=request.getParameter("city");
		String sal =request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		String mob=request.getParameter("mobile");
		long mobile=Long.parseLong(mob);
		String course=request.getParameter("course");
		String[] hobbies=request.getParameterValues("hobbies");
		PrintWriter writer=response.getWriter();
		writer.print("<html><body>");
		writer.print("welcome "+username+"<br>");
		writer.print("your city "+city+"<br>");
		writer.print("your salary  "+salary+"<br>");
		writer.print(mobile+"<br>");
		writer.print(course+"<br>");
		writer.print("</body></html>");
		for(String hobby:hobbies)
			writer.print(hobby);
		}

}
