package com.spring;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");

		if (usr.equals(pwd)) {

			return new ModelAndView("/welcome.jsp");

		} else

			return new ModelAndView("/failure.jsp");

	}

}
