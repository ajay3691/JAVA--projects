package com.student.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.modul.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
