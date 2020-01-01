package edu.swjuhc.houduan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Books;

@Mapper
public interface SieveMapper {

	public List<Books> selectAllQbzp();
	
	public List<Books> selectAllPh();
	
	public List<Books> selectAllWb();
}
