package com.springboot2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot2.dto.StudentDTO;
import com.springboot2.service.IStudentService;

@RestController
public class StudentAPI {
	
	@Autowired
	private IStudentService StudentService;
	
	@GetMapping(value="/Student")
	public List<StudentDTO> showStudent() {
		return StudentService.findAll();
	}
	
	@PostMapping(value="/Student")
	public StudentDTO insertStudent(@RequestBody StudentDTO model) {
		return StudentService.save(model);
	}
	
	@PutMapping(value="/Student")
	public StudentDTO updateStudent(@RequestBody StudentDTO model) {
		return model;
	}
	
	@DeleteMapping(value="/Student/{id}")
	public void deleteStudent(@PathVariable("id") String StudentIDs) {
		StudentService.delete(StudentIDs);
	}
}
