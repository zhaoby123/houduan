package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.HomeService;

@RestController
@RequestMapping("/Home")
public class HomeController {
	@Autowired
	HomeService homeService;
	
	//轮播图
	@RequestMapping("/Lbt")
	public List<Books> Lbt() {
		return homeService.getLbtList();
		
	}
	
	//大神专区
	@RequestMapping("/Dszq")
	public List<Books> Dszq() {
		return homeService.getDszqList();
		
	}

	
	//精品小说
	@RequestMapping("/Jpxs")
	public List<Books> Jpxs() {
		return homeService.getJpxsList();
		
	}

	
	//男生专区
	@RequestMapping("/Nszq")
	public List<Books> Nszq() {
		return homeService.getNszqList();
		
	}

	
	//男频榜
	@RequestMapping("/Npb")
	public List<Books> Npb() {
		return homeService.getNpbList();
		
	}

	
	//女生专区
	@RequestMapping("/Nvszq")
	public List<Books> Nvszq() {
		return homeService.getNvszqList();
		
	}

	
	//女频榜
	@RequestMapping("/Nvpb")
	public List<Books> Nvpb() {
		return homeService.getNvpbList();
		
	}
	
	//本周强推
	@RequestMapping("/Bzqt")
	public List<Books> Bzqt() {
		return homeService.getBzqtList();
		
	}
	
	//编辑推荐
	@RequestMapping("/Bjtj")
	public List<Books> Bjtj() {
		return homeService.getBjtjList();
		
	}


}
