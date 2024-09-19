package com.orm.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.hibernate.dao.DepartmentDao;
import com.orm.hibernate.model.Department;


@Service
@Transactional
public class DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	
	public void saveDepartment(Department department) {
        departmentDao.saveDepartment(department);
    }

}
