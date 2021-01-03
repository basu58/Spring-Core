package com.basu.beans;

public class LoanDetails {
	private int loadId;
	private String loanType;
	private String customer;
	public int getLoadId() {
		return loadId;
	}
	public void setLoadId(int loadId) {
		this.loadId = loadId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LoanDetails [loadId=" + loadId + ", loanType=" + loanType + ", customer=" + customer + "]";
	}
	
}
