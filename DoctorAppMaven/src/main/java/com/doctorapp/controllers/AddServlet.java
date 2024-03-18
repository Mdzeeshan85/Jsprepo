package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	IDoctorService doctorService=new DoctorServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String doctorName=request.getParameter("doctorName");
		
		String speciality=request.getParameter("speciality");
		String rating=request.getParameter("ratings");
		Integer ratings=Integer.parseInt(rating);
		String experiences=request.getParameter("experience");
		Integer experience=Integer.parseInt(experiences);
		String fee=request.getParameter("fees");
		double fees=Double.parseDouble(fee);
		
		Doctor doctor=new Doctor();
		
		doctor.setDoctorName(doctorName);
		doctor.setExperience(experience);
		doctor.setSpeciality(speciality);
		doctor.setRatings(ratings);
		doctor.setFees(fees);
		request.setAttribute("doctor", doctor);
		doctorService.addDoctor(doctor);
		
		
	
		
//		request.setAttribute("doctorName", doctorName);
//		request.setAttribute("speciality", speciality);
//		request.setAttribute("ratings",ratings);
//		request.setAttribute("fees", fees);
//		request.setAttribute("experience", experience);
//		request.setAttribute("doctorId", doctorId);
		RequestDispatcher rd=request.getRequestDispatcher("adminDash.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
