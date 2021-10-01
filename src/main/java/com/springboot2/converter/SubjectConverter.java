package com.springboot2.converter;

import org.springframework.stereotype.Component;

import com.springboot2.dto.SubjectDTO;
import com.springboot2.entity.SubjectEntity;

@Component
public class SubjectConverter {
	public SubjectEntity toEntity(SubjectDTO dto) {
		SubjectEntity entity = new SubjectEntity();
		entity.setSubjectID(dto.getSubjectID());
		entity.setSubjectName(dto.getSubjectName());
		return entity;
	}
	
	public SubjectDTO toDTO(SubjectEntity entity) {
		SubjectDTO dto = new SubjectDTO();
		dto.setSubjectID(entity.getSubjectID());
		dto.setSubjectName(entity.getSubjectName());
		return dto;
	}
}
