package com.movieapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieapp.service.MovieDetails;

/**
 * Servlet implementation class MovieServlet
 */
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session=request.getSession();
		HttpSession session=request.getSession(false);
		PrintWriter writer=response.getWriter();
		writer.print("sessionId "+session.getId()+"<br>");
		writer.print("creation time "+session.getCreationTime()+"<br>");
		writer.print("max inactive "+session.getMaxInactiveInterval()+"<br>");
		
		response.setContentType("text/html");
		String language=request.getParameter("language");
		MovieDetails moviedetails=new MovieDetails();
		List<String>movies=moviedetails.showMovies(language);
		request.setAttribute("movies", movies);
		RequestDispatcher rd=request.getRequestDispatcher("moviesuccess.jsp");
		rd.include(request, response);
		//rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
