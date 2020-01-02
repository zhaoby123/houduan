package edu.swjuhc.houduan.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Administrator;


@Mapper
public interface AdministratorMapper {
	public Administrator selectadministratorByUsername(String username);
	
	public int insertadministrator(Administrator administrator);
}
