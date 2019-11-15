package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Accounts {
	@Id
	private String acnumber;
	private String custid;
	private String bid;
	private int opening_balance;
	@Temporal(TemporalType.DATE)
	private Date aod;
	private String atype;
	private String astatus;
	public String getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public int getOpening_balance() {
		return opening_balance;
	}
	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}
	public Date getAod() {
		return aod;
	}
	public void setAod(Date aod) {
		this.aod = aod;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public String getAstatus() {
		return astatus;
	}
	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}
	public Accounts() {
		super();
	}
	@Override
	public String toString() {
		return "Accounts [acnumber=" + acnumber + ", custid=" + custid + ", bid=" + bid + ", opening_balance="
				+ opening_balance + ", aod=" + aod + ", atype=" + atype + ", astatus=" + astatus + "]";
	}
	
	
}
