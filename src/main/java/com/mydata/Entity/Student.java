package com.mydata.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="student2")
public class Student {
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	@Column(name ="name")
	 private String Name;
	@Column(name ="address")
	 private String Address;
	@Column(name ="phoneNo")
	 private String PhoneNo;
	@Column(name ="city")
	 private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, String phoneNo, String city) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		PhoneNo = phoneNo;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", PhoneNo=" + PhoneNo + ", city="
				+ city + "]";
	}
	
	
	}
