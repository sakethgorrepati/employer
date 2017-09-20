package com.info.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity

public class Employee implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	private int eno;
	private String ename;
	private String gender;
	private double salary;
	private String username;
	private String password;
	
	@OneToOne
	 @JoinColumn(name="ano")
    private Address address;
	
	
	public Employee() {
	
	}
	
	
	public Employee(int eno, String ename, String gender, double salary, String username, String password,
			Address address) {
		
		this.eno = eno;
		this.ename = ename;
		this.gender = gender;
		this.salary = salary;
		this.username = username;
		this.password = password;
		this.address = address;
	}

/*

	public Employee(int eno, String ename, String gender, double salary, String username, String password) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.gender = gender;
		this.salary = salary;
		this.username = username;
		this.password = password;
	}

	*/
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", gender=" + gender + ", salary=" + salary + ", username="
				+ username + "]";
	}


	
}
