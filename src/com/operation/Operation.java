package com.operation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class Operation {
	public static Session getSession() {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		return s;
	}
	
	public static List<Student> findAll() {
		Session s = getSession();
		return s.createQuery("from Student", Student.class).getResultList();
	}
	
	public static Student findById(int studentId) {
		Session s = getSession();
		return s.get(Student.class, studentId);
	}
	
	public static String saveOrUpdate(Student st) {
		Session s = getSession();
		s.beginTransaction();
		s.saveOrUpdate(st);
		s.getTransaction().commit();
		return "Student record saved or updated successfully.";
	}
	
	public static String delete(int studentId) {
		Session s = getSession();
		s.beginTransaction();
		s.delete(s.get(Student.class, studentId));
		s.getTransaction().commit();
		return "Student deleted successfully.";
	}
}
