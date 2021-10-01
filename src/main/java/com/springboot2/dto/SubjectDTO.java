package com.springboot2.dto;

import java.util.ArrayList;
import java.util.List;

import com.springboot2.entity.StudentEntity;
import com.springboot2.entity.TeacherEntity;

public class SubjectDTO {

	private String SubjectID;
	private String SubjectName;
    private List<StudentEntity> ListStudent = new ArrayList<>();
    private List<TeacherEntity> ListTeacher = new ArrayList<>();
	public String getSubjectID() {
		return SubjectID;
	}
	public void setSubjectID(String subjectID) {
		SubjectID = subjectID;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public List<StudentEntity> getListStudent() {
		return ListStudent;
	}
	public void setListStudent(List<StudentEntity> listStudent) {
		ListStudent = listStudent;
	}
	public List<TeacherEntity> getListTeacher() {
		return ListTeacher;
	}
	public void setListTeacher(List<TeacherEntity> listTeacher) {
		ListTeacher = listTeacher;
	}
    
    
}
