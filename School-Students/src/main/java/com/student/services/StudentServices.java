package com.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.modul.Student;
import com.student.repositoy.StudentRepository;

@Service
public class StudentServices {
	@Autowired
	StudentRepository repo;
	
	//crud operations
	// create Student
	public void saveStudent (Student student) {
		repo.save(student);
	}
	 // get student deatils
	public List<Student> getStudents(Student student){
		return repo.findAll();
	
	}
	

}
