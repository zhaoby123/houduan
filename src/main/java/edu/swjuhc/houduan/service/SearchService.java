package edu.swjuhc.houduan.service;

import java.util.List;

import edu.swjuhc.houduan.model.Books;

public interface SearchService {

	public List<Books> getBookList(Books book);
}
