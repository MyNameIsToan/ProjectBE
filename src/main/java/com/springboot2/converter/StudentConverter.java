package com.springboot2.converter;

import org.springframework.stereotype.Component;

import com.springboot2.dto.StudentDTO;
import com.springboot2.entity.StudentEntity;

@Component
public class StudentConverter {
	public StudentEntity toEntity(StudentDTO dto) {
		StudentEntity entity = new StudentEntity();
		entity.setStudentID(dto.getStudentID());
		entity.setStudentName(dto.getStudentName());
		entity.setEmail(dto.getEmail());
		entity.setDateofBirth(dto.getDateofBirth());
		entity.setOrigin(dto.getOrigin());
		entity.setPhonenumber(dto.getPhonenumber());
		return entity;
	}
	
	public StudentDTO toDTO(StudentEntity entity) {
		StudentDTO dto = new StudentDTO();
		dto.setStudentID(entity.getStudentID());
		dto.setStudentName(entity.getStudentName());
		dto.setEmail(entity.getEmail());
		dto.setDateofBirth(entity.getDateofBirth());
		dto.setOrigin(entity.getOrigin());
		dto.setFacultyName(entity.getFaculty().getFacultyName());
		dto.setPhonenumber(entity.getPhonenumber());
		return dto;
	}
}
