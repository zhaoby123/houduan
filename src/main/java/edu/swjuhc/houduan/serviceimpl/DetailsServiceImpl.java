package edu.swjuhc.houduan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.DetailsMapper;
import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.model.Section;
import edu.swjuhc.houduan.service.DetailsService;

@Service
public class DetailsServiceImpl implements DetailsService{
	
	@Autowired
	DetailsMapper detailsMapper;

	@Override
	public List<Section> getChapterList(Section book) {
		// TODO Auto-generated method stub
		return detailsMapper.selectAllChapter(book.getBID());
	}

	@Override
	public Section getContent(Section books) {
		// TODO Auto-generated method stub
		return detailsMapper.selectContent(books.getBID(),books.getC_id());
	}

}
