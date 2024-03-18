package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/doctorServlet")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
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
		String doctorName=request.getParameter("doctorName");
		String docId=request.getParameter("doctorId");
		Integer doctorId=Integer.parseInt(docId);
		String speciality=request.getParameter("speciality");
		String fee=request.getParameter("fees");
		double fees=Double.parseDouble(fee);
		String rating=request.getParameter("ratings");
		Integer ratings=Integer.parseInt(rating);
		String experi=request.getParameter("experience");
		Integer experience=Integer.parseInt(experi);
		
		Doctor doctor=new Doctor();
		doctor.setDoctorId(doctorId);
		doctor.setDoctorName(doctorName);
		doctor.setExperience(experience);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setSpeciality(speciality);
		
		request.setAttribute("doctor", doctor);
		
		request.setAttribute("doctorName", doctorName);
		request.setAttribute("doctorId", doctorId);
		request.setAttribute("speciality", speciality);
		request.setAttribute("fees", fees);
		request.setAttribute("ratings", ratings);
		request.setAttribute("experience", experience);
		RequestDispatcher rd=request.getRequestDispatcher("success1.jsp");
		rd.forward(request, response);
		
	}

}
