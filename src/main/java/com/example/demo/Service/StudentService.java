package com.example.demo.Service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.student.Student;



@Service
public class StudentService {

		@Autowired
		public StudentRepository studentRepo;

	public List<Student> getAllstudents() {
		// TODO Auto-generated method stub
		List<Student> Student =new ArrayList<>();
		studentRepo.findAll().forEach(Student::add);
		return Student;
	}

	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
	   try
	   {
		return studentRepo.findById(id).get();
	   }
	   catch(Exception e)
	   {
	  	 return null;
	   }
	}

	public void addStudent(Student Student) {
		studentRepo.save(Student);
		// TODO Auto-generated method stub
		
	}

	public void updateStudent(Integer id, Student Student) {
		// TODO Auto-generated method stub
		studentRepo.save(Student);
		}

	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		}
	}



