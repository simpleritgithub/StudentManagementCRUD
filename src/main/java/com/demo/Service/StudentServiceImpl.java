package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService  {
	@Autowired
	private StudentDao sd;

	@Override
	public List<Student> findAll() {
		return sd.findAll();
		}

	@Override
	public Student findBySid(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public List<Student> findBySname(String sname) {
		return sd.findBySname(sname);
	}

	@Override
	public List<Student> findBySpercentageBetween(double low, double high) {
		return sd.findBySpercentageBetween(low, high);
	}

	@Override
	public int deleteBySid(int sid) {
		return sd.deleteBySid(sid);
	}

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}
}
