package edu.swjuhc.houduan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.SieveMapper;
import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.SieveService;

@Service
public class SieveServiceImpl implements SieveService{
	
	@Autowired
	SieveMapper sieveMapper;

	@Override
	public List<Books> getQbzpList() {
		// TODO Auto-generated method stub
		return sieveMapper.selectAllQbzp();
	}

	@Override
	public List<Books> getPhList() {
		// TODO Auto-generated method stub
		return sieveMapper.selectAllPh();
	}

	@Override
	public List<Books> getWbList() {
		// TODO Auto-generated method stub
		return sieveMapper.selectAllWb();
	}

}
