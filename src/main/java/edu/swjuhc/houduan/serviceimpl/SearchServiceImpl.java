package edu.swjuhc.houduan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.SearchMapper;
import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	SearchMapper searchMapper;

	@Override
	public List<Books> getBookList(Books book) {
		// TODO Auto-generated method stub
		return searchMapper.selectAllLBook(book.getBookname());
	}

}
