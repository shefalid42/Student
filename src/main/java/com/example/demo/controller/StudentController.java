package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.Service.StudentService;
import com.example.demo.student.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	@RequestMapping("/Student")
	public List<Student> getAllStudents()
	{
		List<Student> Student = studentservice.getAllstudents();
		
		if(Student.size() <= 0)
			throw new UserNotFoundException("Student details are not available, please update first.");
			
	  return Student;
	}
	@GetMapping("/Student/{id}")
	public Student getStudent(@PathVariable Integer id)
	{
		Student Student = studentservice.getStudent(id);
		
		if(Student ==  null)
			throw new UserNotFoundException("Student ID are not present");
			
	  return Student;
	}
	@RequestMapping(method =RequestMethod.POST , value="/Student" )
	public void addStudent(@RequestBody Student Student)
	{
		studentservice.addStudent(Student);
	}
	@RequestMapping(method =RequestMethod.PUT , value="/Student/{id}" )
	public void updateStudent(@PathVariable Integer id ,@RequestBody Student Student)
	{
		studentservice.updateStudent(id,Student);
	}
	@RequestMapping(method =RequestMethod.DELETE , value="/Student/{id}" )
	public void DeleteStudent(@PathVariable Integer id)
	{
		studentservice.deleteStudent(id);
	}
}


