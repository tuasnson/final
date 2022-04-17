package com.se2_project.group12.demoEBanking.IService;

import com.se2_project.group12.demoEBanking.Model.Loan;

public interface ILoanService {
	public Loan getLoan(int accountId);
	public String addLoan(String loan);
	public String deleteLoan(int accountId);
	public String editLoan(String loan);
	public boolean isEmpty(int accountId);
}
