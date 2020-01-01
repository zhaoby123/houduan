package edu.swjuhc.houduan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Books;

@Mapper
public interface ClassificationMapper {
	public List<Books> selectAllXh();
	
	public List<Books> selectAllQh();

	public List<Books> selectAllWx();
	
	public List<Books> selectAllXx();
	
	public List<Books> selectAllDs();
	
	public List<Books> selectAllXs();
	
	public List<Books> selectAllJs();
	
	public List<Books> selectAllLs();
	
	public List<Books> selectAllYx();
	
	public List<Books> selectAllTy();
	
	public List<Books> selectAllKh();
	
	public List<Books> selectAllXyly();
	
	public List<Books> selectAllNsw();
	
	public List<Books> selectAllQxs();
}
