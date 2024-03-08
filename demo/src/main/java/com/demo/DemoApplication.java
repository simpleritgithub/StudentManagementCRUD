package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(DemoApplication.class, args);
	StudentService ss  = context.getBean(StudentService.class);
	Student s  = new Student();
	s.setSname("Grace");
	s.setScity("Rome");
	s.setSmail("outlook.com");
	s.setSnumber("8056794897");
	s.setSpercentage(61.38);
	System.out.println(ss.save(s));
	}

}
    