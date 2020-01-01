package edu.swjuhc.houduan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Section;

@Mapper
public interface DetailsMapper {
	
	public List<Section> selectAllChapter(int BID);
	
	public Section selectContent(int BID,int C_id);
}
