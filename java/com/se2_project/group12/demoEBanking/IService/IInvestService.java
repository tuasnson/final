package com.se2_project.group12.demoEBanking.IService;

import com.se2_project.group12.demoEBanking.Model.InvestType;

public interface IInvestService {
	public InvestType getInvest(int accountId);
	public String addInvestType(String investType);
	public String deleteInvestType(int accountId);
	public String editInvestType(String investType);
	public boolean isEmpty(int accountId);
}
