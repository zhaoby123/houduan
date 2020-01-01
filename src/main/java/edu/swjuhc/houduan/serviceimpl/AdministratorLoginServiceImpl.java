package edu.swjuhc.houduan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.AdministratorLoginMapper;
import edu.swjuhc.houduan.model.Administrator;
import edu.swjuhc.houduan.service.AdministratorLoginService;

@Service
public class AdministratorLoginServiceImpl implements AdministratorLoginService{
	@Autowired
	AdministratorLoginMapper administratorLoginMapper;
	@Override
	public int Login(Administrator administrator) {
		//调用mapper实现登录
		Administrator u0=administratorLoginMapper.selectAdministratorByUsername(administrator.getID());
		String po=administrator.getPassword();
		System.out.println(u0);
		System.out.println(administrator);
		int i=-1;
		if (u0!=null) {
			i=0;
		}else {
			i=2;
		}
		return i;
		
	}
}
