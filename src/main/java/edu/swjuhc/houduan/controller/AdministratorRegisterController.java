package edu.swjuhc.houduan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorRegisterService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Administrator")
public class AdministratorRegisterController {
	@Autowired
	AdministratorRegisterService administratorRegisterService;
	@RequestMapping("/register")
	public JSONObject register(@RequestBody Administrator rejister) {
		JSONObject result=new JSONObject();
		int i=administratorRegisterService.Register(rejister);
		result.put("state", i);
		return result;
	}
	
}
