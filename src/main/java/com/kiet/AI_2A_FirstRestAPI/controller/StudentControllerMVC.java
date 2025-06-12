package com.kiet.AI_2A_FirstRestAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kiet.AI_2A_FirstRestAPI.model.Student;
import com.kiet.AI_2A_FirstRestAPI.service.StudentService;

@Controller
public class StudentControllerMVC {

	private StudentService service;
	
	
	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}



	
	//http://localhost:9090/students/101
	@GetMapping("/students/{id}")
	//toreturn All The students
	public String getStudentById(Model model,@PathVariable int id ) {
		Student stud= service.reteriveStudentById(id);
		model.addAttribute("student", stud);  
		return "demo";
		
	}
	//http://localhost:9090/students/update/101
	@GetMapping("/students/update/{id}")
	public String updatePage(Model model ,@PathVariable int id ) {
		model.addAttribute("student",service.reteriveStudentById(id));
		return "student";
	}
//http://localhost:9090/students/delete/101
	@GetMapping("/students/delete/{id}")
	//toreturn All The students
	public String removeStudent(@PathVariable int id ) {
		service.removeById(id);
		
		return "redirect:/students";
	}
	
	@GetMapping("/students")
	//toreturn All The students
	public String getAllStudents(Model model) {
		List<Student> s =service.reteriveAllStudents();
		model.addAttribute("students", s);
		return "index";
	}	
	
	//http://localhost:9090/students/add

	@GetMapping("/students/add")
	public String addPage(Model model) {
		model.addAttribute("student",new Student());
		return "student";
	}
	//http://localhost:9090/students/save
		@PostMapping("/students/save")
		//toreturn All The students
		public String insertStudent(@ModelAttribute Student student) {
			service.saveStudent(student);
			return "redirect:/students";
		}
	
	
	
	
	
}
