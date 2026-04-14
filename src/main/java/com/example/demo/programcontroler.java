package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class programcontroler
{	@GetMapping("/")
	public String homepage()
	{
		return "home";    //home.jsp
	}
	
	@GetMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	
	@GetMapping("/ragistration")
	public String ragistration()
	{
		return "ragistration";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/student_info")
	public String student_info()
	{
		return "student_info";
	}

}
