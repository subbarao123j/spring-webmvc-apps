package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		return "home";
	}
	
	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productPage(ModelMap model) {

		return "products";
	}
	@ RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {

		return "contactus";
	}


}
