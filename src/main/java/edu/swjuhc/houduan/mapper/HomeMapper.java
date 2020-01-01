package edu.swjuhc.houduan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Books;

@Mapper
public interface HomeMapper {
	
	public List<Books> selectAllLbt();
	
	public List<Books> selectAllDszq();
	
	public List<Books> selectAllJpxs();
	
	public List<Books> selectAllNszq();
	
	public List<Books> selectAllNpb();
	
	public List<Books> selectAllNvszq();
	
	public List<Books> selectAllNvpb();
	
	public List<Books> selectAllBzqt();
	
	public List<Books> selectAllBjtj();
}
