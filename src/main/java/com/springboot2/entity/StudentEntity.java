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
@Table(name="student")
public class StudentEntity {
	
	@Id
	private String StudentID;
	@Column
	private String StudentName;
	@Column
	private Date DateofBirth;
	@Column
	private String Email;
	@Column
	private String Origin;
	@Column(name="phonenum")
	private String Phonenumber;
	
	@ManyToOne
    @JoinColumn(name = "faculty")
    private FacultyEntity faculty;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Subject", 
				joinColumns = @JoinColumn(name = "Student_id"), 
				inverseJoinColumns = @JoinColumn(name = "Subject_id"))
	private List<SubjectEntity> ListSubject = new ArrayList<>();
	
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
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}	
}
