package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.SieveService;

@RestController
@RequestMapping("/Sieve")
public class SieveController {

	@Autowired
	SieveService sieveService;
	
	//全部作品
	@RequestMapping("/Qbzp")
	public List<Books> Qbzp() {
		return sieveService.getQbzpList();
		
	}
	
	//排行
	@RequestMapping("/Ph")
	public List<Books> Ph() {
		return sieveService.getPhList();
		
	}
	
	//完本
	@RequestMapping("/Wb")
	public List<Books> Wb() {
		return sieveService.getWbList();
		
	}
}
