package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repo extends JpaRepository<Alien, Integer> {
	//List<Alien>findByid(Integer id);
	List<Alien>findByaidGreaterThan(Integer aid);
	@Query("from Alien where tech=?1 order by name")
	List<Alien>findBytechSorted(String name);
	
}
