package edu.swjuhc.houduan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.UserLandingsMapper;
import edu.swjuhc.houduan.model.SysUser;
import edu.swjuhc.houduan.service.UserLandingsService;

@Service
public class UserLandingsServiceImpl implements UserLandingsService{
	
	@Autowired
	UserLandingsMapper userLandingsMapper;
	
	@Override
	public int Landings(SysUser user) {
		// TODO Auto-generated method stub
		//调用mapper实现登陆
		SysUser u0 = userLandingsMapper.selectUserByUsername(user.getUsername());
		String p0 = user.getPassword();
		System.out.println(u0);
		System.out.println(user);
		int i = -1;
		if (u0!=null) {
			i=0;
		}else {
			i = 2;
		}
		
		
		
		return i;
	}

}
