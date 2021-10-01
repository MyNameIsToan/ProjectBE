package com.springboot2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.dto.TeacherDTO;
import com.springboot2.service.ITeacherService;

@RestController
public class TeacherAPI {
	@Autowired
	private ITeacherService teacherService;
	
	@GetMapping(value="/Teacher")
	public List<TeacherDTO> showTeacher() {
		return teacherService.findAll();
	}
	
	@PostMapping(value="/Teacher")
	public TeacherDTO insertTeacher(@RequestBody TeacherDTO model) {
		return teacherService.save(model);
	}
	
	@PutMapping(value="/Teacher")
	public TeacherDTO updateTeacher(@RequestBody TeacherDTO model) {
		return model;
	}
	
	@DeleteMapping(value="/Teacher/{id}")
	public void deleteTeacher(@PathVariable("id") String teacherIDs) {
		teacherService.delete(teacherIDs);
	}
}
