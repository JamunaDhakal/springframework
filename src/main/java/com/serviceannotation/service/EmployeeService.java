package com.serviceannotation.service;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.serviceannotation.model.Employee;

@Service
public class EmployeeService {
	private final Map<Long, Employee> employeeMap = new HashMap<>();
	private long idCount = 1;
	
	public Employee addEmployee(String name) {
		Employee employee = new Employee(idCount++, name);
		employeeMap.put(employee.getId(), employee);
		return employee;	
	}
	
	public Optional<Employee> getEmployeeById(Long id) {
        return Optional.ofNullable( employeeMap.get(id));
    }
	
 
}
