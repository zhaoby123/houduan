package edu.swjuhc.houduan.mapper;

import org.apache.ibatis.annotations.Mapper;


import edu.swjuhc.houduan.model.SysUser;

@Mapper
public interface UserLandingsMapper {
	public SysUser selectUserByUsername(String username);
	
	public int insertUser(SysUser user);
}
