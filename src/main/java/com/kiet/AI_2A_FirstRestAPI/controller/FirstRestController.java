package com.kiet.AI_2A_FirstRestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AI_2A_FirstRestAPI.model.Student;
//To Orgnize the Imports we use cmd+shift+o mac
//ctrl+shif+o windows
@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
	

	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul Dixit","AI 2A","9015088066");
	}
	
}
