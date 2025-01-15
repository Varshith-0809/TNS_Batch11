package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Did;
	private String Dname;
	private String DAddress;
	private String DCode;
	
	
	public Department() {
		super();
	}


	public Department(Long did, String dname, String dAddress, String dCode) {
		super();
		Did = did;
		Dname = dname;
		DAddress = dAddress;
		DCode = dCode;
	}


	public Long getDid() {
		return Did;
	}


	public void setDid(Long did) {
		Did = did;
	}


	public String getDname() {
		return Dname;
	}


	public void setDname(String dname) {
		Dname = dname;
	}


	public String getDAddress() {
		return DAddress;
	}


	public void setDAddress(String dAddress) {
		DAddress = dAddress;
	}


	public String getDCode() {
		return DCode;
	}


	public void setDCode(String dCode) {
		DCode = dCode;
	}


	@Override
	public String toString() {
		return "Department [Did=" + Did + ", Dname=" + Dname + ", DAddress=" + DAddress + ", DCode=" + DCode + "]";
	}
	
	
	

}
