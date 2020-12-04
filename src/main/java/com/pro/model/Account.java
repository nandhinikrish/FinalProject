package com.pro.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  @Column(name="accno")
	int accno;

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	
	
	
	
	@Column(name="acctype")
	String acctype;

	
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	
	
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="custid",unique=true)
	private Customer custid;

	public Customer getCustid() {
		return custid;
	}
	public void setCustid(Customer custid) {
		this.custid = custid;
	}

}

