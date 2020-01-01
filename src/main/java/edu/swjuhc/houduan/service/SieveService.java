package edu.swjuhc.houduan.service;

import java.util.List;

import edu.swjuhc.houduan.model.Books;

public interface SieveService {
	
	public List<Books> getQbzpList();
	
	public List<Books> getPhList();
	
	public List<Books> getWbList();

}
