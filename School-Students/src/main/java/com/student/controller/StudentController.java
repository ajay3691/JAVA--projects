package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.modul.Student;
import com.student.services.StudentServices;

@RestController
public class StudentController {
	
	//Crud API
	
	@Autowired
	StudentServices serv;
	/*
	 URL: localhost:8080/apis/product
	 Method:POSt
	 Required:id,name,price,qty,info
	*/
	@PostMapping("/Student")
	public void addStudent (@RequestBody Student student) {
		serv.saveStudent(student);
	}
	/*
	 URL: localhost:8080/apis/products
	 Method:GET
	 Required:None
	*/
	@GetMapping("/Students")
	public List<Student>GetStudent(){
		return serv.getStudents(null);
	}
	
	
	
	
	
	

}
