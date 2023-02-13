package com.example.demo1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface repo extends CrudRepository<course,Integer>{

//	List <course> findbyid(Integer cid);
}
