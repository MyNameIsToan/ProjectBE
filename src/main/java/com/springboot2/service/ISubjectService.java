package com.springboot2.service;

import java.util.List;

import com.springboot2.dto.SubjectDTO;

public interface ISubjectService {
	SubjectDTO save(SubjectDTO subjectDTO);
	void delete(String SubjectIDs);
	List<SubjectDTO> findAll();
}
