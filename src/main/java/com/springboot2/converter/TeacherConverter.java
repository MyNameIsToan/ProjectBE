package com.springboot2.converter;

import org.springframework.stereotype.Component;

import com.springboot2.dto.TeacherDTO;
import com.springboot2.entity.TeacherEntity;

@Component
public class TeacherConverter {
	public TeacherEntity toEntity(TeacherDTO dto) {
		TeacherEntity entity = new TeacherEntity();
		entity.setTeacherID(dto.getTeacherID());
		entity.setTeacherName(dto.getTeacherName());
		entity.setEmail(dto.getEmail());
		entity.setDateofBirth(dto.getDateofBirth());
		entity.setOrigin(dto.getOrigin());
		return entity;
	}
	
	public TeacherDTO toDTO(TeacherEntity entity) {
		TeacherDTO dto = new TeacherDTO();
		dto.setTeacherID(entity.getTeacherID());
		dto.setTeacherName(entity.getTeacherName());
		dto.setEmail(entity.getEmail());
		dto.setDateofBirth(entity.getDateofBirth());
		dto.setOrigin(entity.getOrigin());
		dto.setFacultyName(entity.getFaculty().getFacultyName());
		return dto;
	}
}
