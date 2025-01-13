package com.dailycodebuffer.Springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.Springboot.tutorial.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
