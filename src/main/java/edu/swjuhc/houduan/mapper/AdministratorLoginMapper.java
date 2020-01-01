package edu.swjuhc.houduan.mapper;
import org.apache.ibatis.annotations.Mapper;


import edu.swjuhc.houduan.model.Administrator;


@Mapper


public interface AdministratorLoginMapper {
	public Administrator selectAdministratorByUsername(String username);
}
