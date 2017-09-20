package com.info.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.info.dao.EmployeeDAO;

import com.info.model.Employee;


@Controller
public class EmployeeController{
	@Autowired
	EmployeeDAO eDao;
	@RequestMapping("/showCreate.htm")
	public String showCreatePage(ModelMap modelMap)
	{
		Employee employee = new Employee();
		//Address	address = new Address();
		//System.out.println("create");
		Map<String, String> genderMap = new HashMap<>();
		genderMap.put("Male", "Male");
		genderMap.put("Female", "Female");
		modelMap.addAttribute("genderMap", genderMap);
		modelMap.addAttribute("createCommand", employee);
		
		
		return "/CreateEmployee.jsp";
	}
	
	@RequestMapping("/showLogin.htm")
	public String showLoginPage(ModelMap modelMap)
	{
		
		Employee employee = new Employee();
		modelMap.addAttribute("loginCommand", employee);
		return "/login.jsp";
	}
	
	@RequestMapping("/home.htm")
	public String showHomePage()
	{
		
		return "/Home.jsp";
	}
	
	@RequestMapping("/create.htm")
	public ModelAndView addEmployee(@ModelAttribute("createCommand") Employee employee) 
	{
		
		int result = eDao.addEmployee(employee);
		
		
		ModelAndView mView = new ModelAndView();
		if(result > 0)
		{
		mView.addObject("message", employee.getEno() +" Employee Created ");
		mView.setViewName("/showCreate.htm");
		
		}
		return mView;
	}
	@RequestMapping("/check.htm")
	public ModelAndView checkEmployee(Employee employee)
	{
		
	
		boolean flag = eDao.checkEmployee(employee);
		
		ModelAndView mView = new ModelAndView();
		//RequestDispatcher dispatcher; 
		if(flag)
		{
			mView.addObject("user", employee.getUsername());
			mView.setViewName("Home.jsp");
			
			
		}else
		{
			mView.addObject("message", "invalid credentials");
		    mView.setViewName("/showLogin.htm");
		
		}
		return mView;
	}
	
	@RequestMapping("/view.htm")
	public ModelAndView viewEmployeeDetails() 
	{
		
		List<Employee> allEmployees = eDao.viewEmployeeDetails();
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("allEmployees", allEmployees);
		mView.setViewName("/view.jsp");
		
		return mView;
	}
	
	@RequestMapping("/remove.htm")
	public ModelAndView deleteEmployee(@RequestParam("ano") int no) 
	{
		System.out.println(no);		
		eDao.deleteEmployee(no);
		ModelAndView mView = new ModelAndView();
			List<Employee> allEmployees = eDao.viewEmployeeDetails();
		
			mView.addObject("allEmployees", allEmployees);
			mView.setViewName("view.jsp");
			
			
			
		
		return mView;
		
	}
	
}
