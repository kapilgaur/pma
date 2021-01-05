package com.jrp.pma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jrp.pma.dao.EmployeeRepository;

@Service
public class EmployeeService {
	
	// Field Injection
//	@Qualifier("staffRepository1")
//	@Autowired
	IStaffRepository empRepo;
	
	
	
	// Constructor Injection
//	public EmployeeService(@Qualifier("staffRepository1") IStaffRepository empRepo) {
//		super();
//		this.empRepo = empRepo;
//	}
//	
	
	// Setter Injection
	@Autowired
	@Qualifier("staffRepository1")
	public void setEmpRepo(IStaffRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	

		
}
