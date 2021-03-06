package com.se2_project.group12.demoEBanking.IService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.se2_project.group12.demoEBanking.Model.Business;
@Service
public interface IBusinessService {
	
	public Business getBusinessAccountById(int businessId);
	
	public List<Business> getAllBusiness();
	
	public String deleteBusinessById(int businessId);
	
	public String addBusiness(String business);
	
	public String editBusiness(String business);
	
	
	
}
