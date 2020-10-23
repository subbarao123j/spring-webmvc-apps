package com.spring;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@Autowired
	private LoginModel loginModel;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

		String usr = request.getParameter("username");
		String pwd = request.getParameter("password");

		boolean flag = loginModel.isValid(usr, pwd);

		if (flag) {
			return new ModelAndView("/welcome");

		} else
			return new ModelAndView("/failure");
	}

}
