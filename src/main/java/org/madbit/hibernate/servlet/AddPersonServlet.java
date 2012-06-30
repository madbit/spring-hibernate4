package org.madbit.hibernate.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.madbit.hibernate.dao.MyDAO;
import org.madbit.hibernate.entity.Person;

public class AddPersonServlet extends HttpServlet {

	private static final long serialVersionUID = -8426816328296476020L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		Person p = new Person();
		p.setFirstname(firstname);
		p.setLastname(lastname);
		
		MyDAO myDAO = new MyDAO();
		myDAO.addPerson(p);		
	}
}