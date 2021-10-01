package com.springboot2.dto;

import java.util.ArrayList;
import java.util.List;

import com.springboot2.entity.StudentEntity;
import com.springboot2.entity.TeacherEntity;

public class FacultyDTO {

	private String facultyId;
	private String facultyName;
	private List<StudentEntity> StudentList = new ArrayList<>();
	private List<TeacherEntity> TeacherList = new ArrayList<>();
	private List<String> StudentIDList = new ArrayList<>();
	private List<String> TeacherIDList = new ArrayList<>();
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
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
	public List<String> getStudentIDList() {
		return StudentIDList;
	}
	public void setStudentIDList(List<String> studentIDList) {
		StudentIDList = studentIDList;
	}
	public List<String> getTeacherIDList() {
		return TeacherIDList;
	}
	public void setTeacherIDList(List<String> teacherIDList) {
		TeacherIDList = teacherIDList;
	}
}
