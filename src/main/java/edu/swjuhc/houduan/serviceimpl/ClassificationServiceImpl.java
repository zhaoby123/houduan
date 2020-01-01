package edu.swjuhc.houduan.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjuhc.houduan.mapper.ClassificationMapper;
import edu.swjuhc.houduan.model.Books;
import edu.swjuhc.houduan.service.ClassificationService;

@Service
public class ClassificationServiceImpl implements ClassificationService{

	@Autowired
	ClassificationMapper classificationMapper;
	
	@Override
	public List<Books> getXhList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllXh();
	}
	
	@Override
	public List<Books> getQhList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllQh();
	}
	
	@Override
	public List<Books> getWxList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllWx();
	}
	
	@Override
	public List<Books> getXxList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllXx();
	}
	
	@Override
	public List<Books> getDsList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllDs();
	}
	
	@Override
	public List<Books> getXsList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllXs();
	}
	
	@Override
	public List<Books> getJsList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllJs();
	}
	
	@Override
	public List<Books> getLsList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllLs();
	}
	
	@Override
	public List<Books> getYxList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllYx();
	}
	
	@Override
	public List<Books> getTyList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllTy();
	}
	
	@Override
	public List<Books> getKhList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllKh();
	}
	
	@Override
	public List<Books> getXylyList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllXyly();
	}
	
	@Override
	public List<Books> getNswList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllNsw();
	}
	
	@Override
	public List<Books> getQxsList() {
		// TODO Auto-generated method stub
		return classificationMapper.selectAllQxs();
	}
}
