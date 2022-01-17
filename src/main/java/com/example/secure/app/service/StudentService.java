package com.example.secure.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.secure.app.entity.Student;
import com.example.secure.app.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(Student student)
	{
		return studentRepository.save(student);
	}
	
	public List<Student> getStudents()
	{
		List<Student> students= studentRepository.findAll();
		return students;
	}
}
