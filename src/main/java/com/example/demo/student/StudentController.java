package com.example.demo.student;

import java.util.Arrays;
import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * *
 * This gives the ability to expose resources and endpoints that the client can consume.
 *
 */
@RequestMapping(path = "api/v1/students")
public class StudentController {
	
	
	@GetMapping
	public List <Student> getAllStudents(){
		List<Student> students= Arrays.asList(
				new Student(1L, "smith", "ter@l.com", null),
				new Student(2L, "rust", "gh@v.com", null),
				new Student(3L, "thomas", "abc2@m.com", null)
		);
		return students;
		}

	
}

