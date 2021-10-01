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

import com.springboot2.dto.FacultyDTO;
import com.springboot2.service.IFacultyService;

@RestController
public class FacultyAPI {
	@Autowired
	private IFacultyService FacultyService;
	
	@GetMapping(value="/Faculty")
	public List<FacultyDTO> showStudent() {
		return FacultyService.findAll();
	}
	
	@PostMapping(value="/Faculty")
	public FacultyDTO insertFaculty(@RequestBody FacultyDTO model) {
		return FacultyService.save(model);
	}
	
	@PutMapping(value="/Faculty")
	public FacultyDTO updateFaculty(@RequestBody FacultyDTO model) {
		return model;
	}
	
	@DeleteMapping(value="/Faculty/{id}")
	public void deleteFaculty(@PathVariable("id") String facultyIDs) {
		FacultyService.delete(facultyIDs);
	}
}
