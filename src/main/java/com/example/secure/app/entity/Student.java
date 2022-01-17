package com.example.secure.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{
	@Id
	private long id;
	private String name;
	private String gender;
	private int age;
	private String subjectTaken;

	public Student() {}

	public Student(long id, String name, String gender, int age, String subjectTaken) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subjectTaken = subjectTaken;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSubjectTaken() {
		return subjectTaken;
	}

	public void setSubjectTaken(String subjectTaken) {
		this.subjectTaken = subjectTaken;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", subjectTaken="
				+ subjectTaken + "]";
	}
}
