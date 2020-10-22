package com.spring;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	private LoginModel loginModel;

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {

		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");

		boolean flag = loginModel.isValid(usr, pwd);

		if (flag) {

			return new ModelAndView("/welcome.jsp");

		} else

			return new ModelAndView("/failure.jsp");

	}

}
