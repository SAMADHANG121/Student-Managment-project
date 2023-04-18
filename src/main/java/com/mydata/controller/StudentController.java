package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.Entity.Student;
import com.mydata.Repository.StudentInterface;

@RestController
@RequestMapping("api/v1")
public class StudentController {
	
	@Autowired
	 private StudentInterface std;
	
	@GetMapping("/getAll")
	public List<Student> findAll(){
		return std.findAll();
	}
	@GetMapping("/get/{id}")
	public Student findById(@PathVariable("id") int id) {
		return std.findById(id).get();
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return std.save(student);
	}
	@PutMapping("/update/{id}")
	public Student updateById(@PathVariable("id") int id, @RequestBody Student student1) {
		return std.save(student1);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
	   std.deleteById(id);
	}

}
