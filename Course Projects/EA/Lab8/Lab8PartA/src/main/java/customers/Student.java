package customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Student {
	@Id
	private int studentNumber;
	private String name;
	private String email;
	private String phone;
	private Address address;
	public List<Grade> grades = new ArrayList<>();
	public Student(int studentNumber, String name, String email, String phone) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
	
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Grade> getGrades() {
		return grades;
	}
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", grades=" + grades + "]";
	}


}