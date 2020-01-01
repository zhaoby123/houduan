package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.ClassificationService;


@RestController
@RequestMapping("/Classification")
public class ClassificationController {
	@Autowired
	ClassificationService classificationService;
	
	//玄幻
	@RequestMapping("/Xh")
	public List<Books> Xh() {
		return classificationService.getXhList();
		
	}
	
	//奇幻
	@RequestMapping("/Qh")
	public List<Books> Qh() {
		return classificationService.getQhList();
		
	}

	//武侠
		@RequestMapping("/Wx")
		public List<Books> Wx() {
			return classificationService.getWxList();
			
	}

	//仙侠
	@RequestMapping("/Xx")
	public List<Books> Xx() {
		return classificationService.getXxList();
			
	}

	//都市
	@RequestMapping("/Ds")
	public List<Books> Ds() {
		return classificationService.getDsList();
		
	}

	//现实
	@RequestMapping("/Xs")
	public List<Books> Xs() {
		return classificationService.getXsList();
		
	}
	
	//军事
	@RequestMapping("/Js")
	public List<Books> Js() {
		return classificationService.getJsList();
		
	}
	
	//历史
	@RequestMapping("/Ls")
	public List<Books> Ls() {
		return classificationService.getLsList();
		
	}

	//游戏
		@RequestMapping("/Yx")
		public List<Books> Yx() {
			return classificationService.getYxList();
			
	}

	//体育
	@RequestMapping("/Ty")
	public List<Books> Ty() {
		return classificationService.getTyList();
			
	}

	//科幻
	@RequestMapping("/Kh")
	public List<Books> Kh() {
		return classificationService.getKhList();
		
	}

	//悬疑灵异
	@RequestMapping("/Xyly")
	public List<Books> Xyly() {
		return classificationService.getXylyList();
		
	}
	
	//女生网
	@RequestMapping("/Nsw")
	public List<Books> Nsw() {
		return classificationService.getNswList();
		
	}

	//轻小说
	@RequestMapping("/Qxs")
	public List<Books> Qxs() {
		return classificationService.getQxsList();
		
	}
}
