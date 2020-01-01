package edu.swjuhc.houduan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Books;

@Mapper
public interface ClassificationMapper {
	public List<Books> selectAllXh();
}
