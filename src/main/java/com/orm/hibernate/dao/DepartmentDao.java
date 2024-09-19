package com.orm.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orm.hibernate.model.Department;

@Service
@Transactional
public class DepartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
    public void saveDepartment(Department department) {
    	Session session = sessionFactory.getCurrentSession();
        session.persist(department);
    	
    }

}
