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

import com.springboot2.dto.SubjectDTO;
import com.springboot2.service.ISubjectService;

@RestController
public class SubjectAPI {
	@Autowired
	private ISubjectService subjectService;
	
	@GetMapping(value="/Subject")
	public List<SubjectDTO> showSubject() {
		return subjectService.findAll();
	}
	
	@PostMapping(value="/Subject")
	public SubjectDTO insertSubject(@RequestBody SubjectDTO model) {
		return subjectService.save(model);
	}
	
	@PutMapping(value="/Subject")
	public SubjectDTO updateSubject(@RequestBody SubjectDTO model) {
		return model;
	}
	
	@DeleteMapping(value="/Subject/{id}")
	public void deleteSubject(@PathVariable("id") String SubjectIDs) {
		subjectService.delete(SubjectIDs);
	}
}
