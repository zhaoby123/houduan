package edu.swjuhc.houduan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.AdministratorRegisterMapper;
import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorRegisterService;

@Service
public class AdministratorRegisterServiceImpl implements AdministratorRegisterService{
	@Autowired
	AdministratorRegisterMapper administratorRegisterMapper;
	@Override
	public int Register(Administrator administrator) {
		// TODO Auto-generated method stub
		Administrator m0=administratorRegisterMapper.SelectAdministratorById(administrator.getId());
		int i=-2;
		if (m0==null) {
			i=administratorRegisterMapper.insertId(administrator);
		}
		else {
			i=2;
		}
		return i;
	}

}
