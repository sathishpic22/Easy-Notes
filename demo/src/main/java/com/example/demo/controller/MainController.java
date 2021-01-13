package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repositary.StudenRepositary;
@RestController
public class MainController {
	@Autowired
	StudenRepositary sr;
	@GetMapping("test")
	public List<Student> get(){
		List<Student> l=(List<Student>) sr.findAll();
		
		
		return l;
	}
	
	@PostMapping("save")
	public Student save(){
		
		Student s=new Student();
		s.setDept("civil");s.setName("Nava");s.setNo(50);
		
		return  sr.save(s);

		
	}
	@PutMapping("test/{no}")
	public Optional<Student> getone(@PathVariable(value="no") int noi){
		System.out.println(noi);
		return sr.findById(noi);
		
		
	}
	@DeleteMapping("test/{no}")
	public void get(@PathVariable(value="no") Student noi){
		System.out.println(noi);
		 sr.delete(noi);
		
		
	}
	
	}
		
		

	


