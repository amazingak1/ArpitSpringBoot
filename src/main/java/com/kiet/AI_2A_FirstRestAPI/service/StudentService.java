package com.kiet.AI_2A_FirstRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.AI_2A_FirstRestAPI.model.Student;
import com.kiet.AI_2A_FirstRestAPI.repository.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
//		repository.save(new Student(101, "Rahul", "Java", "9015088066"));
//		repository.save(new Student(102, "Anmol", "Java", "9015088066"));
//		repository.save(new Student(103, "Aditya", "Java", "9015088066"));
//		repository.save(new Student(104, "Aryan", "Java", "9015088066"));
//		repository.save(new Student(105, "Bhavna", "Java", "9015088066"));
	}

	public List<Student> reteriveAllStudents() {
		return repository.findAll();
	}

	public Student reteriveStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	public void removeById(int id) {
		repository.deleteById(id);
		
	}

}
