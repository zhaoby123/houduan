package edu.swjuhc.houduan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Administrator")
public class AdministratorController {
	@Autowired
	AdministratorService administratorService;

	@RequestMapping("/landings")
	public JSONObject landings(Administrator administrator) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = administratorService.Landings(administrator);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/Registration")
	public JSONObject Registration(Administrator administrator) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = administratorService.Registration(administrator);
		result.put("state", i);
		return result;
	}
	
}
