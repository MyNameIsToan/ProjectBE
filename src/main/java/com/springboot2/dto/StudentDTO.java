package com.springboot2.dto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.springboot2.entity.SubjectEntity;

public class StudentDTO {
	
	private String StudentID;
	private String StudentName;
	private Date DateofBirth;
	private String Email;
	private String Origin;
    private String FacultyName;
    private String Phonenumber;
	private List<SubjectEntity> ListSubject = new ArrayList<>();
	private List<String> ListIDSubject = new ArrayList<>();
	private List<String> ListNameSubject = new ArrayList<>();
	
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
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
		return FacultyName;
	}
	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
	public List<SubjectEntity> getListSubject() {
		return ListSubject;
	}
	public void setListSubject(List<SubjectEntity> listSubject) {
		ListSubject = listSubject;
	}
	public List<String> getListNameSubject() {
		return ListNameSubject;
	}
	public void setListNameSubject(List<String> listNameSubject) {
		ListNameSubject = listNameSubject;
	}
	public List<String> getListIDSubject() {
		return ListIDSubject;
	}
	public void setListIDSubject(List<String> listIDSubject) {
		ListIDSubject = listIDSubject;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
}
