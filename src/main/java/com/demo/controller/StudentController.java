package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.StudentService;
import com.demo.model.Student;

@RestController
public class StudentController {
    @Autowired
    private StudentService ss;
    
    // insert Student
    @PostMapping(value = "/save")
    public String m6(@RequestBody Student s) {
        ss.save(s);
        return "Inserted Successfully";
    }

    // Find All Student
    @GetMapping(value = "/findAll")
    public List<Student> m1() {
        return ss.findAll();
    }

 // find Student By id
    @GetMapping(value = "/findById/{id}")
    public ResponseEntity<Student> m2(@PathVariable int id) {
        Student student = ss.findBySid(id);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    

    // find Student By Name
    @GetMapping(value = "/findByName/{name}")
    public List<Student> m3(@PathVariable String name) {
        return ss.findBySname(name);
    }

    // find Student Whose percentage between range
    @GetMapping(value = "/Findbypercentagebetween/{a}/{b}")
    public List<Student> m4(@PathVariable("a") double low, @PathVariable("b") double high) {
        return ss.findBySpercentageBetween(low, high);
    }

    // Delete Student By Sid
    @DeleteMapping(value = "/deletebyid/{id}")
    public String m5(@PathVariable int id) {
        int deleted = ss.deleteBySid(id);
        if (deleted > 0) {
            return "Deleted Successfully";
        } else {
            return "No student found with ID: " + id + ". Deletion failed.";
        }
    }

  

    // update Student
    @PutMapping(value = "/update")
    public String m7(@RequestBody Student s) {
        ss.save(s);
        return "Updated Successfully";
    }
}

