package com.ge.predix.emp.repo;

import com.ge.predix.emp.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findByName(String name);

}
