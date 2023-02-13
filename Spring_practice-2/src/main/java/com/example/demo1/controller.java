package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

//	@Autowired
//	
	@Autowired
	repo Repo;
	private internfce m;
	@GetMapping("/")
	public String control()
	{
		return "home.jsp";
	}
	@GetMapping("/getcourses")
	public List<String> getcourses()
	{
		return this.m.getallcourse();
	}
	@GetMapping("/getId")
	public List<Integer> getId()
	{
		return this.m.getCourseId();
	}
	
	@RequestMapping("/added")
	public String add(course Course )
	{
		System.out.println("Hello World");
		Repo.save(Course);
		return "home.jsp";
	}
	
//	@GetMapping("/search")
//	public void search(Integer k)
//	{
//		Repo.findbyid(k);
//	}
}
