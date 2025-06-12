package com.kiet.AI_2A_FirstRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AI_2A_FirstRestAPI.model.Student;
import com.kiet.AI_2A_FirstRestAPI.service.StudentService;

//@RestController
public class StudentController {

	private StudentService service;
	
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}


	@GetMapping("/students")
	//toreturn All The students
	public List<Student> getAllStudents() {
		return service.reteriveAllStudents();
	}
	
	//http://localhost:9090/students/101
	@GetMapping("/students/{id}")
	//toreturn All The students
	public Student getStudentById(@PathVariable int id ) {
		return service.reteriveStudentById(id);
	}
	
	@DeleteMapping("/students/{id}")
	//toreturn All The students
	public void removeStudent(@PathVariable int id ) {
		service.removeById(id);
	}
	
	

	@PostMapping("/students")
	//toreturn All The students
	public Student insertStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	
	
	
	
}
