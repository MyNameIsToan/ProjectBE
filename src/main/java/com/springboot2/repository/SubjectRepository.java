package com.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.entity.SubjectEntity;

public interface SubjectRepository extends JpaRepository<SubjectEntity, String> {
	SubjectEntity findOneBysubjectID(String SubjectId);
}
