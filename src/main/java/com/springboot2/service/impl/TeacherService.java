package com.springboot2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.converter.TeacherConverter;
import com.springboot2.dto.TeacherDTO;
import com.springboot2.entity.FacultyEntity;
import com.springboot2.entity.SubjectEntity;
import com.springboot2.entity.TeacherEntity;
import com.springboot2.repository.FacultyRepository;
import com.springboot2.repository.SubjectRepository;
import com.springboot2.repository.TeacherRepository;
import com.springboot2.service.ITeacherService;

@Service
public class TeacherService implements ITeacherService{
	@Autowired
	private TeacherRepository  teacherRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private TeacherConverter teacherConverter;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Override
	public TeacherDTO save(TeacherDTO teacherDTO) {
		TeacherEntity Teacher = new TeacherEntity();
		Teacher = teacherConverter.toEntity(teacherDTO);
		FacultyEntity faculty = facultyRepository.findOneByFacultyName(teacherDTO.getFacultyName());
		Teacher.setFaculty(faculty);
		List<SubjectEntity> ListOfSubject = new ArrayList<>();
		List<SubjectEntity> subjects = teacherDTO.getListSubject();
		for(int i = 0; i < subjects.size();i++)
		{	
			SubjectEntity entity = subjectRepository.findOneBysubjectID(subjects.get(i).getSubjectID());
			ListOfSubject.add(entity);
		}
		Teacher.setListSubject(ListOfSubject);
		Teacher = teacherRepository.save(Teacher);
		return teacherConverter.toDTO(Teacher);
	}

	@Override
	public void delete(String teacherIDs) {
		TeacherEntity Teacher = teacherRepository.findOne(teacherIDs);
		Teacher.getListSubject().removeAll(Teacher.getListSubject());
		teacherRepository.delete(Teacher);
	}
	
	@Override
	public List<TeacherDTO> findAll() {
		List<TeacherDTO> results = new ArrayList<>();
		List<TeacherEntity> entities = teacherRepository.findAll();
		for(TeacherEntity item: entities) {
			TeacherDTO TeacherDTO = teacherConverter.toDTO(item);
			results.add(TeacherDTO);
		}
		return results;
	}
	
}
