package edu.swjuhc.houduan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.SearchService;

@RestController
@RequestMapping("/Search")
public class SearchController {
	@Autowired
	SearchService searchService;

	
	@RequestMapping("/Major")
	public List<Books> Major(Books book) {
		return searchService.getBookList(book);
		
	}
}
