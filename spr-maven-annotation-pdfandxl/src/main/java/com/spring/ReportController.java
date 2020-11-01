package com.spring;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReportController {

	@GetMapping("/")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse res) {
		String reportType = request.getParameter("type");

		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101, "Shubham", 10000));
		employees.add(new Employee(102, "Naveen", 10000));
		employees.add(new Employee(103, "Rama", 10000));

		if (reportType != null && reportType.equals("xls")) {
			return new ModelAndView(new ExcelEmployeeListReportView(), "empList", employees);
		} else if (reportType != null && reportType.equals("pdf")) {
			return new ModelAndView(new PdfEmployeeListReportView(), "empList", employees);
		}
		return new ModelAndView("index", "empList", employees);
	}
}
