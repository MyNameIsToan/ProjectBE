package com.springboot2.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class TeacherEntity {
	@Id
	private String TeacherID;

	@Column
	private String TeacherName;
	
	@Column
	private Date DateofBirth;
	
	@Column
	private String Email;
	
	@Column
	private String Origin;

	@ManyToOne
	@JoinColumn(name = "faculty")
	private FacultyEntity faculty;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Teacher_Subject", 
				joinColumns = @JoinColumn(name = "Teacher_id"), 
				inverseJoinColumns = @JoinColumn(name = "Subject_id"))
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

	public FacultyEntity getFaculty() {
		return faculty;
	}

	public void setFaculty(FacultyEntity faculty) {
		this.faculty = faculty;
	}

	public List<SubjectEntity> getListSubject() {
		return ListSubject;
	}

	public void setListSubject(List<SubjectEntity> listSubject) {
		ListSubject = listSubject;
	}
	
}
