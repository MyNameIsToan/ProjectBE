package com.springboot2.converter;

import org.springframework.stereotype.Component;

import com.springboot2.dto.FacultyDTO;
import com.springboot2.entity.FacultyEntity;

@Component
public class FacultyConverter {
	public FacultyEntity toEntity(FacultyDTO dto) {
		FacultyEntity entity = new FacultyEntity();
		entity.setFacultyID(dto.getFacultyId());
		entity.setFacultyName(dto.getFacultyName());
		return entity;
	}
	
	public FacultyDTO toDTO(FacultyEntity entity) {
		FacultyDTO dto = new FacultyDTO();
		dto.setFacultyId(entity.getFacultyID());
		dto.setFacultyName(entity.getFacultyName());
		return dto;
	}
}
