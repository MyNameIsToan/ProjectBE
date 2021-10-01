package com.springboot2.service;

import java.util.List;

import com.springboot2.dto.TeacherDTO;

public interface ITeacherService {
	TeacherDTO save(TeacherDTO teacherDTO);
	void delete(String teacherIDs);
	List<TeacherDTO> findAll();
}
