package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.operation.Operation;

public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/student/create.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Student s = new Student();
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setCity(request.getParameter("city"));
		s.setAge(Integer.parseInt(request.getParameter("age")));
		Operation.saveOrUpdate(s);
		
		response.sendRedirect("/first_web_application/students");
	}
}
