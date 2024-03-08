package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer > {
	
	//insert Student
	Student save(Student s);
	//Display student 
	List<Student>findAll();
	Student findBySid(int sid);
	List <Student> findBySname(String sname);
	List<Student> findBySpercentageBetween(double low ,double high);
	
	//Delete Student
	int deleteBySid(int sid);
	
	

	
} 
