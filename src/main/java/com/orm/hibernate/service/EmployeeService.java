package com.orm.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.hibernate.dao.EmployeeDao;
import com.orm.hibernate.model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }
	

}
