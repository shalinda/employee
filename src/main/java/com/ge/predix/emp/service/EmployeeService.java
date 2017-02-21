package com.ge.predix.emp.service;

import com.ge.predix.emp.domain.Employee;
import com.ge.predix.emp.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(String name, String empType, String address) {
        Employee employee = employeeRepository.findByName(name);
        if (employee == null) {
            throw new RuntimeException("Employee already exists " + name);
        }
        return employeeRepository.save(new Employee(name, empType, address));
    }
}
