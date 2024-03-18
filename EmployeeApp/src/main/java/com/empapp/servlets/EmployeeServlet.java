package com.empapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
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
		String employeeName=request.getParameter("employeeName");
		String city=request.getParameter("city");
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		String empId=request.getParameter("employeeId");
		Integer employeeId=Integer.parseInt(empId);
		String course=request.getParameter("course");
		
		Employee employee=new Employee();
		employee.setEmployeeId(employeeId);
		employee.setCity(city);
		employee.setEmployeeName(employeeName);
		employee.setSalary(salary);
		employee.setCourse(course);
		
		request.setAttribute("employee", employee);
		
		request.setAttribute("employeeName", employeeName);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("employeeId", employeeId);
		request.setAttribute("course", course);
		RequestDispatcher rd=request.getRequestDispatcher("empsuccess.jsp");
		rd.forward(request, response);
		
	}

}
