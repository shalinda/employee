/**
 * 
 */
package com.ge.predix.emp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ge.predix.emp.domain.Student;

/**
 * @author semika
 *
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public Student findByName(@Param("name") String name);
}
