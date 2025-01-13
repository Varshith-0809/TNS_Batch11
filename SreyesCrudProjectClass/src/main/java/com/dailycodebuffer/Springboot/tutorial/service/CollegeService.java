package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;

import com.dailycodebuffer.Springboot.tutorial.entity.College;

public interface CollegeService {

	public College saveCollege(College college);

	public List<College> fetchCollegeList();

	public College fetchCollegeById(Long CollegeId);

	public void deleteCollegeById(Long CollegeId);

	public College updateCollege(Long CollegeId, College college);

}
