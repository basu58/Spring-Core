package com.basu.beans;

public class BankLoanApprover {
	private LoanDetails details;

	public LoanDetails getDetails() {
		return details;
	}

	public void setDetails(LoanDetails details) {
		this.details = details;
	}
	
	public String approveLoans() {
		if(details.getLoanType().equals("2-wheeler")) {
			return "Loan Approved";
		}
		else
			return "Loan rejected";
	}
	
	@Override
	public String toString() {
		return "BankLoanApprover [details=" + details + "]";
	}
	
	
}
