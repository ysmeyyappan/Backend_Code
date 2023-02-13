package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class courseimpl implements internfce{

	List<course>X=new ArrayList<>();
	courseimpl()
	{
//		X.add(new course(2,"java"));
//		X.add(new course(1,"c++"));
	}
	@Override
	public List<String> getallcourse() {
		List<String>z=new ArrayList<>();
		for(course Course:X)
		{
			z.add(Course.Course_name);
		}
		System.out.println(z);
		return z;
	}
	@Override
	public List<Integer> getCourseId() {
		List<Integer>z1 =new ArrayList<>();
		for(course Course:X)
		{
			z1.add(Course.Couse_Id);
		}
		return z1;
	}
	
}
