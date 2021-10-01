package com.springboot2.service;

import java.util.List;

import com.springboot2.dto.StudentDTO;

public interface IStudentService {
	StudentDTO save(StudentDTO studentDTO);
	void delete(String StudentIDs);
	List<StudentDTO> findAll();
}
