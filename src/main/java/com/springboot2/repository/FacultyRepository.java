package com.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.entity.FacultyEntity;

public interface FacultyRepository extends JpaRepository<FacultyEntity, String> {
	FacultyEntity findOneByFacultyName(String FacultyName);
}
