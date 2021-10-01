package com.springboot2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class SubjectEntity {
	@Id
	private String subjectID;
	
	@Column	
	private String subjectName;
	
	@ManyToMany(mappedBy = "ListSubject")
    private List<StudentEntity> ListStudent = new ArrayList<>();
	
	@ManyToMany(mappedBy = "ListSubject")
    private List<TeacherEntity> ListTeacher = new ArrayList<>();

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
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
