package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.model.Section;
import edu.swjuhc.houduan.service.DetailsService;

@RestController
@RequestMapping("/Details")
public class DetailsController {

	@Autowired
	DetailsService detailsService;
	
	@RequestMapping("/Chapter")
	public List<Section> Chapter(Section book) {
		return detailsService.getChapterList(book);
		
	}
	
	@RequestMapping("/Content")
	public Section Content(Section books) {
		return detailsService.getContent(books);
		
	}
}
