package com.springboot2.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.converter.StudentConverter;
import com.springboot2.dto.StudentDTO;
import com.springboot2.entity.FacultyEntity;
import com.springboot2.entity.StudentEntity;
import com.springboot2.entity.SubjectEntity;
import com.springboot2.repository.FacultyRepository;
import com.springboot2.repository.StudentRepository;
import com.springboot2.repository.SubjectRepository;
import com.springboot2.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	
	@Autowired
	private StudentConverter studentConverter;
	
	@Override
	public StudentDTO save(StudentDTO studentDTO) {
		StudentEntity Student = new StudentEntity();
		Student = studentConverter.toEntity(studentDTO);
		FacultyEntity faculty = facultyRepository.findOneByFacultyName(studentDTO.getFacultyName());
		Student.setFaculty(faculty);
		List<SubjectEntity> ListOfSubject = new ArrayList<>();
		List<String> subjects = studentDTO.getListIDSubject();
		for(int i = 0; i < subjects.size();i++)
		{	
			SubjectEntity entity = subjectRepository.findOneBysubjectID(subjects.get(i));
			ListOfSubject.add(entity);
		}
		Student.setListSubject(ListOfSubject);
		Student = studentRepository.save(Student);
		return studentConverter.toDTO(Student);
	}

	@Override
	public void delete(String StudentIDs) {
		StudentEntity Student = studentRepository.findOne(StudentIDs);
		Student.getListSubject().removeAll(Student.getListSubject());
		studentRepository.delete(Student);
	}

	@Override
	public List<StudentDTO> findAll() {
		List<StudentDTO> results = new ArrayList<>();
		List<StudentEntity> entities = studentRepository.findAll();
		for(StudentEntity item: entities) {
			StudentDTO StudentDTO = studentConverter.toDTO(item);
			List<String> SubjectName = new ArrayList<>();
			for(SubjectEntity Subject : item.getListSubject()) {
				SubjectName.add(Subject.getSubjectName());
			}
			StudentDTO.setListNameSubject(SubjectName);
			results.add(StudentDTO);
		}
		return results;
	}
}
