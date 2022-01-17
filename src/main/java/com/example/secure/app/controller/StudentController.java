package com.example.secure.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.secure.app.entity.Student;
import com.example.secure.app.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudent()
	{
		return studentRepository.findAll();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student)
	{
		return studentRepository.save(student);
	}
}
