package com.se2_project.group12.demoEBanking.IService;

import java.util.List;


import com.se2_project.group12.demoEBanking.Model.Service;
@org.springframework.stereotype.Service
public interface IServiceService {
	public Service getServiceById(int serviceId);
	public List<Service> getAllService();
	public String addService(String service);
	public String deleteServiceById(int serviceId);
	public String editService(String service);
	public List<Service> getServicesByBusiness(int businessId);
}
