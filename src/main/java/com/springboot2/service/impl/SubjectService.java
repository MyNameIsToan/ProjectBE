package com.springboot2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.converter.SubjectConverter;
import com.springboot2.dto.SubjectDTO;
import com.springboot2.entity.StudentEntity;
import com.springboot2.entity.SubjectEntity;
import com.springboot2.entity.TeacherEntity;
import com.springboot2.repository.SubjectRepository;
import com.springboot2.service.ISubjectService;

@Service
public class SubjectService implements ISubjectService {
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private SubjectConverter subjectConverter;
	
	@Override
	public SubjectDTO save(SubjectDTO subjectDTO) {
		SubjectEntity Subject = new SubjectEntity();
		Subject = subjectConverter.toEntity(subjectDTO);
		Subject = subjectRepository.save(Subject);
		return subjectConverter.toDTO(Subject);
	}

	@Override
	public void delete(String SubjectIDs) {
		SubjectEntity Subject = subjectRepository.findOne(SubjectIDs);
		for(StudentEntity student : Subject.getListStudent())
		{
			student.getListSubject().remove(Subject);
		}
		for(TeacherEntity teacher : Subject.getListTeacher())
		{
			teacher.getListSubject().remove(Subject);
		}
		subjectRepository.delete(Subject);	
	}

	@Override
	public List<SubjectDTO> findAll() {
		List<SubjectDTO> results = new ArrayList<>();
		List<SubjectEntity> entities = subjectRepository.findAll();
		for(SubjectEntity item: entities) {
			SubjectDTO SubjectDTO = subjectConverter.toDTO(item);
			results.add(SubjectDTO);
		}
		return results;
	}
}
