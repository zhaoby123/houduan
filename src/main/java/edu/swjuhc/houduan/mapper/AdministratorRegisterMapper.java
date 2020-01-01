package edu.swjuhc.houduan.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjuhc.houduan.model.Administrator;

@Mapper
public interface AdministratorRegisterMapper {
	public Administrator SelectAdministratorById(int Id);
	public int insertId(Administrator Id);
}
