package edu.swjuhc.houduan.service;

import java.util.List;

import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.model.Section;

public interface DetailsService {
	public List<Section> getChapterList(Section book);
	
	public Section getContent(Section books);
}
