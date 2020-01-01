package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.ClassificationService;


@RestController
@RequestMapping("/Classification")
public class ClassificationController {
	@Autowired
	ClassificationService classificationService;
	
	@RequestMapping("/Xh")
	public List<Books> Xh() {
		return classificationService.getXhList();
		
	}
}
