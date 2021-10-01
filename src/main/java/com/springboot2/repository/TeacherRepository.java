package com.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot2.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, String>{

}
