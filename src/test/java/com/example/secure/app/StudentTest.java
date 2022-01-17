package com.example.secure.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import com.example.secure.app.entity.Student;
import com.example.secure.app.repository.StudentRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestMethodOrder(OrderAnnotation.class)
public class StudentTest {
	@MockBean
    private StudentRepository studentRepository;
	
	@Test
	@Rollback(false)
	@Order(1)
	public void testAddStudent() {
	    Student savedStudent = studentRepository.save(new Student(1L,"Sukriti Dhar", "female", 21, "Computer"));
	    assertThat(savedStudent);
	}
	
	@Test
	@Order(2)
	public void testGetStudents() {
	    List<Student> students = (List<Student>) studentRepository.findAll();
	    assertNotNull(students);
	}
}
