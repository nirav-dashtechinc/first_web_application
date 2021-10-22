package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Student;
import com.operation.Operation;

public class EditStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("student", Operation.findById(id));
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/student/edit.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Student s = new Student();
		s.setId(Integer.parseInt(request.getParameter("id")));
		s.setName(request.getParameter("name"));
		s.setEmail(request.getParameter("email"));
		s.setCity(request.getParameter("city"));
		s.setAge(Integer.parseInt(request.getParameter("age")));
		Operation.saveOrUpdate(s);
		
		response.sendRedirect("/first_web_application/students");
	}
}
