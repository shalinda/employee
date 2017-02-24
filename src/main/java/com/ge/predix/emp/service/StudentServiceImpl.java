/**
 * 
 */
package com.ge.predix.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ge.predix.emp.domain.Student;
import com.ge.predix.emp.repo.StudentRepository;


/**
 * @author semika
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}
} 
