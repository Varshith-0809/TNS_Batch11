package com.dailycodebuffer.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long CollegeId;
	 private String CollegeAdmin;
	    private String CollegeName;
	    private String CollegeLocation;
		public Long getCollegeId() {
			return CollegeId;
		}
		
		
		public void setCollegeId(Long CollegeId) {
			this.CollegeId = CollegeId;
		}
		
		
		public String getCollegeAdmin() {
			return CollegeAdmin;
		}
		public void setCollegeAdmin(String CollegeAdmin) {
			this.CollegeAdmin = CollegeAdmin;
		}
		
		
		public String getCollegeName() {
			return CollegeName;
		}
		public void setCollegeName(String CollegeName) {
			this.CollegeName = CollegeName;
		}
		
		
		public String getCollegeLocation() {
			return CollegeLocation;
		}
		public void setCollegeLocation(String CollegeLocation) {
			this.CollegeLocation = CollegeLocation;
		}
		
		public College() {
			super();
		}
	
		public College(Long CollegeId, String CollegeAdmin, String CollegeName, String CollegeLocation) {
			
			this.CollegeId = CollegeId;
			this.CollegeAdmin = CollegeAdmin;
			this.CollegeName = CollegeName;
			this.CollegeLocation = CollegeLocation;
		}
		@Override
		public String toString() {
			return "College [CollegeId=" + CollegeId + ", CollegeAdmin" + CollegeAdmin
					+ ", CollegeName=" + CollegeName + ", CollegeLocation=" + CollegeLocation + "]";
		}
		
	
	
	
}
