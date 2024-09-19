package com.orm.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.orm.hibernate.model.Department;
import com.orm.hibernate.model.Employee;

@Repository
@Transactional
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    
    public void saveEmployee(Employee employee) {
    	
        Session session = sessionFactory.getCurrentSession();
       
        session.persist(employee);
    	
    }


}
