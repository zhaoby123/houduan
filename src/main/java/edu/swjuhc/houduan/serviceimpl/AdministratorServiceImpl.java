package edu.swjuhc.houduan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.AdministratorMapper;
import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorService;
@Service
public class AdministratorServiceImpl implements AdministratorService{
	@Autowired
	AdministratorMapper administratorMapper;
	
	@Override
	public int Landings(Administrator administrator) {
		// TODO Auto-generated method stub
		//调用mapper实现登陆
		Administrator u0 = administratorMapper.selectadministratorByUsername(administrator.getNumber());
		String p0 = administrator.getPassword();	
		int i = -1;
		if (u0==null) {
			i=2;
		}else {
			if (administrator.getPassword().equals(u0.getJ_password())) {
				i = 0;
			}else {
				i=1;
			}
		}		
		return i;
	}
	
	@Override
	public int Registration(Administrator administrator) {
		// TODO Auto-generated method stub
		//调用mapper实现注册
		Administrator u0 = administratorMapper.selectadministratorByUsername(administrator.getNumber());
		String p0 = administrator.getPassword();	
		int i = -1;
		if (u0==null) {
			i = administratorMapper.insertadministrator(administrator);
		}else {
			i = 2;
		}	
		return i;
	}

}
