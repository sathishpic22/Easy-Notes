package com.example.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudenRepositary extends CrudRepository<Student,Integer> {

	

	

	
}
