package com.springboot2.service;

import java.util.List;

import com.springboot2.dto.FacultyDTO;

public interface IFacultyService {
	FacultyDTO save(FacultyDTO facultyDTO);
	void delete(String facultyIDs);
	List<FacultyDTO> findAll();
}
