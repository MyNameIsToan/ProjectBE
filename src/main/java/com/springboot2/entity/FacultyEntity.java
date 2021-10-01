package com.springboot2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class FacultyEntity {
	@Id
	private String facultyId;
	
	@Column
	private String facultyName;
	
	@OneToMany(mappedBy = "faculty")
	private List<StudentEntity> StudentList = new ArrayList<>();
	
	@OneToMany(mappedBy = "faculty")
	private List<TeacherEntity> TeacherList = new ArrayList<>();

	public String getFacultyID() {
		return facultyId;
	}

	public void setFacultyID(String facultyID) {
		facultyId = facultyID;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<StudentEntity> getStudentList() {
		return StudentList;
	}

	public void setStudentList(List<StudentEntity> studentList) {
		StudentList = studentList;
	}

	public List<TeacherEntity> getTeacherList() {
		return TeacherList;
	}

	public void setTeacherList(List<TeacherEntity> teacherList) {
		TeacherList = teacherList;
	}
	
	
}
