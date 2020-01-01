package edu.swjuhc.houduan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.HomeMapper;
import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeMapper homeMapper;

	@Override
	public List<Books> getLbtList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllLbt();
	}

	@Override
	public List<Books> getDszqList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllDszq();
	}

	@Override
	public List<Books> getJpxsList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllJpxs();
	}

	@Override
	public List<Books> getNszqList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllNszq();
	}

	@Override
	public List<Books> getNpbList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllNpb();
	}

	@Override
	public List<Books> getNvszqList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllNvszq();
	}

	@Override
	public List<Books> getNvpbList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllNvpb();
	}

	@Override
	public List<Books> getBzqtList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllBzqt();
	}

	@Override
	public List<Books> getBjtjList() {
		// TODO Auto-generated method stub
		return homeMapper.selectAllBjtj();
	}
}
