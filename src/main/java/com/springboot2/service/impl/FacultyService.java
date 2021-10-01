package com.springboot2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot2.converter.FacultyConverter;
import com.springboot2.dto.FacultyDTO;
import com.springboot2.entity.FacultyEntity;
import com.springboot2.entity.StudentEntity;
import com.springboot2.entity.SubjectEntity;
import com.springboot2.entity.TeacherEntity;
import com.springboot2.repository.FacultyRepository;
import com.springboot2.service.IFacultyService;

@Service
public class FacultyService implements IFacultyService{
	
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private FacultyConverter facultyConverter;
	
	@Override
	public FacultyDTO save(FacultyDTO facultyDTO) {
		FacultyEntity Faculty = new FacultyEntity();
		Faculty = facultyConverter.toEntity(facultyDTO);
		Faculty = facultyRepository.save(Faculty);
		return facultyConverter.toDTO(Faculty);
	}

	@Override
	public void delete(String facultyIDs) {
		FacultyEntity Faculty = facultyRepository.findOne(facultyIDs);
		List<TeacherEntity> ListOfTeacher = Faculty.getTeacherList();
		for(TeacherEntity teacher:ListOfTeacher) {
			FacultyEntity SubFaculty = facultyRepository.findOne("0");
			teacher.setFaculty(SubFaculty);
		}
		List<StudentEntity> ListOfStudent = Faculty.getStudentList();
		for(StudentEntity student :ListOfStudent) {
			FacultyEntity SubFaculty = facultyRepository.findOne("0");
			student.setFaculty(SubFaculty);
		}
		facultyRepository.delete(Faculty);
	}

	@Override
	public List<FacultyDTO> findAll() {
		List<FacultyDTO> results = new ArrayList<>();
		List<FacultyEntity> entities = facultyRepository.findAll();
		for(FacultyEntity item:entities) {
			FacultyDTO facultyDTO = facultyConverter.toDTO(item);
			List<String> StudentIDs = new ArrayList<>();
			for(StudentEntity Student : item.getStudentList()) {
				StudentIDs.add(Student.getStudentID());
			}
			facultyDTO.setStudentIDList(StudentIDs);
			List<String> TeacherIDs = new ArrayList<>();
			for(TeacherEntity Teacher : item.getTeacherList()) {
				TeacherIDs.add(Teacher.getTeacherID());
			}
			facultyDTO.setTeacherIDList(TeacherIDs);
			results.add(facultyDTO);
		}
		return results;
	}
	
}
