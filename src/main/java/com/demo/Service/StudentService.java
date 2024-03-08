package com.demo.Service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {
	

	Student save(Student s);
	
	List<Student>findAll();
	
	Student findBySid(int sid);
	
	List <Student> findBySname(String sname);
	
	List<Student> findBySpercentageBetween(double low ,double high);
	
	int deleteBySid(int sid);
	
	
	
}
