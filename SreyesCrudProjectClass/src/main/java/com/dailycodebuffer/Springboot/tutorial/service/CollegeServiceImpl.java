package com.dailycodebuffer.Springboot.tutorial.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.College;
//import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public List<College> fetchCollegeList() {
        return collegeRepository.findAll();
    }

   @Override
   public College fetchCollegeById(Long CollegeId) {
	   return collegeRepository.findById(CollegeId).get();
   }
	
   @Override
   public void deleteCollegeById(Long CollegeId) {
       collegeRepository.deleteById(CollegeId);
   }


   @Override
   public College updateCollege(Long CollegeId, College college) {
       College depDB = collegeRepository.findById(CollegeId).get();

       if(Objects.nonNull(college.getCollegeAdmin()) &&
       !"".equalsIgnoreCase(college.getCollegeAdmin())) {
           depDB.setCollegeAdmin(college.getCollegeAdmin());
       }

       if(Objects.nonNull(college.getCollegeName()) &&
               !"".equalsIgnoreCase(college.getCollegeName())) {
           depDB.setCollegeName(college.getCollegeName());
       }

       if(Objects.nonNull(college.getCollegeLocation()) &&
               !"".equalsIgnoreCase(college.getCollegeLocation())) {
           depDB.setCollegeLocation(college.getCollegeLocation());
       }

       return collegeRepository.save(depDB);
   }

    
    

}
