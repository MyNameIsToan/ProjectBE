package com.springboot2.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.springboot2.entity.SubjectEntity;

public class TeacherDTO {

	private String TeacherID;
	private String TeacherName;
	private Date DateofBirth;
	private String Email;
	private String Origin;
	private String facultyName;
	private List<SubjectEntity> ListSubject = new ArrayList<>();
	
	public String getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(String teacherID) {
		TeacherID = teacherID;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public Date getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String origin) {
		Origin = origin;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public List<SubjectEntity> getListSubject() {
		return ListSubject;
	}
	public void setListSubject(List<SubjectEntity> listSubject) {
		ListSubject = listSubject;
	}
}
