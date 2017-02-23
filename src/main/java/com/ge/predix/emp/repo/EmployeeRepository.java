package com.ge.predix.emp.repo;

import com.ge.predix.emp.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by shalindaranasinghe on 2/21/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findByName(@Param("name") String name);

}
