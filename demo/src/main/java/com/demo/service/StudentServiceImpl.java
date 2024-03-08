package com.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
	 return sd.save(s);
	}
}
