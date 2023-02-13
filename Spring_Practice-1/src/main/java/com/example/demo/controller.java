package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	@Autowired
	repo Repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/add")
	public ModelAndView home1(Alien alien1)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien1);
		mv.setViewName("home.jsp");
		System.out.println(alien1.aid+" "+alien1.name);
		Repo.save(alien1);
		return mv;
	}
	@PostMapping(path="/get",consumes= {"application/json"})
	@ResponseBody
	public Alien post(@RequestBody Alien alien1)
	{
		Repo.delete(alien1);
		return alien1;
	}
	@DeleteMapping(path="/get/{aid}",consumes= {"application/json"})
	@ResponseBody
	public String delete(@PathVariable int aid)
	{
		Repo.deleteById(aid);
		return "deleted";
	}
	@PutMapping(path="/get",consumes= {"application/json"})
	@ResponseBody
	public Alien put(@RequestBody Alien alien1)
	{
		Repo.save(alien1);
		return alien1;
	}
	@RequestMapping("/get")
	@ResponseBody
	public List<Alien> home3()
	{
		return Repo.findAll();
	}
	@RequestMapping("/get/{aid}")
	@ResponseBody
	public Optional<Alien> home2(@PathVariable("aid") Integer aid)
	{
		return Repo.findById(aid);
//		ModelAndView mv=new ModelAndView(); 
//		Alien alien2=Repo.findById(aid).orElse(new Alien());
//		mv.addObject("obj1",alien2);
//		mv.setViewName("home.jsp");
//		System.out.println(alien2.aid+" "+alien2.name);
//		System.out.println(Repo.findByname(alien2.name));
//		System.out.println(Repo.findByaidGreaterThan(2));
//		System.out.println(Repo.findBytechSorted("java"));
//		return mv;
	}
}
