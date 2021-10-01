package com.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, String>{
	
}
