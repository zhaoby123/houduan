package edu.swjuhc.houduan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.SysUser;
import edu.swjuhc.houduan.service.UserLandingsService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserLandingsController {
	@Autowired
	UserLandingsService userLandingsService;

	@RequestMapping("/landings")
	public JSONObject landings(SysUser user) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = userLandingsService.Landings(user);
		result.put("state", i);
		return result;
	}
	
	@RequestMapping("/Registration")
	public JSONObject Registration(SysUser user) {
		JSONObject result = new JSONObject();
		
		//调用Service层
		int i = userLandingsService.Registration(user);
		result.put("state", i);
		return result;
	}
	
}
