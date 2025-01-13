package com.dailycodebuffer.Springboot.tutorial.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.tutorial.entity.College;
//import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.service.CollegeService;



@RestController
public class CollegeController {
	
	@Autowired
	CollegeService collegeService;
	

    @PostMapping("/college")
    public College saveCollege(@RequestBody College college) {
       
        return collegeService.saveCollege(college);
    }
    

    @GetMapping("/college")
    public List<College> fetchCollegeList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return collegeService.fetchCollegeList();
    }
    


    @GetMapping("/college/{id}")
    public College fetchCollegeById(@PathVariable("id") Long CollegeId)
            {
        return collegeService.fetchCollegeById(CollegeId);
    }
    
    @DeleteMapping("/college/{id}")
    public String deleteCollegeById(@PathVariable("id") Long CollegeId) {
        collegeService.deleteCollegeById(CollegeId);
        return "College deleted Successfully!!";
    }
    
    @PutMapping("/college/{id}")
    public College updateCollege(@PathVariable("id") Long CollegeId,
                                       @RequestBody College college) {
        return collegeService.updateCollege(CollegeId, college);
    }
}
