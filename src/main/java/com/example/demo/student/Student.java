package com.example.demo.student;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String age;
	private String gender;
	 Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String age,String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender=gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}
	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender= gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + " , gender=" + gender+"]";
	}
	

}



