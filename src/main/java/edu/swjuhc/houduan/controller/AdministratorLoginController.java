package edu.swjuhc.houduan.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorLoginService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Administrator")
public class AdministratorLoginController {
		@Autowired
		AdministratorLoginService  administratorLoginService;
		@RequestMapping("/login")
		public JSONObject login(@RequestBody Administrator administrator) {
			JSONObject result=new JSONObject();
			//调用service层
			int i=administratorLoginService.Login(administrator);
			result.put("state", i);
			return result;
		}
		
}
