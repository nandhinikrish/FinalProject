package com.pro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="customer")
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="id")
	int custid;
	
	@Column(name="firstname")
	String fname;
	@Column(name="lastname")
	String lname;
	@Column(name="age")
	int age;
	@Column(name="gender")
	String gender;
	@Column(name="city")
	String city;
	@Column(name="occupation")
	String occupation;
	/*@Column(name="email")
	String Email;*/
	@Column(name="contactno")
	String cno;
	
	
	
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/*public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}*/
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	
	
	/*public Account getAcctype() {
		return acctype;
	}
	public void setAcctype(Account acctype) {
		this.acctype = acctype;
	}*/
	
}
