package com.orm.hibernate.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.orm.hibernate.config.AppConfig;

import com.orm.hibernate.model.Department;
import com.orm.hibernate.model.Employee;
import com.orm.hibernate.service.DepartmentService;
import com.orm.hibernate.service.EmployeeService;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		DepartmentService departmentService = context.getBean(DepartmentService.class);
		Department department = new Department();
		department.setName("animal2");
		Employee employee = new Employee();
		employee.setDepartment(department);
		employee.setName("jamu1");
		employee.setSalary(50000);
		departmentService.saveDepartment(department);
		employeeService.saveEmployee(employee);
		System.out.println("Employee saved!");
		
		
	     
		 
		
	
		
		
	}

	private static Department Department() {
		// TODO Auto-generated method stub
		return null;
	}

}
