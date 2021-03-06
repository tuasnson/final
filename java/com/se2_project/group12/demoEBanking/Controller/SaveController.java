package com.se2_project.group12.demoEBanking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.se2_project.group12.demoEBanking.Model.Save;
import com.se2_project.group12.demoEBanking.Service.SaveService;

@RestController
public class SaveController {
	
	final String org = "http://127.0.0.1:5500";

	@Autowired
	SaveService saveService;

	@GetMapping(value = "/save/getSave")
	@CrossOrigin(origins = org)
	public Save getSave(@RequestParam int accountId) {
		return saveService.getSave(accountId);
	}

	@PostMapping(value = "/save/addSave")
	@CrossOrigin(origins = org)
	public String addSave(@RequestBody String save) {
		return saveService.addSave(save);
	}

	@DeleteMapping(value = "/save/deleteSave")
	@CrossOrigin(origins = org)
	public String deleteSave(@RequestParam int accountId) {
		return saveService.deleteSave(accountId);

	}
	
	@PutMapping(value = "/save/editSave")
	@CrossOrigin(origins = org)
	public String editSave(@RequestBody String save) {
		return saveService.editSave(save);
	}

}
