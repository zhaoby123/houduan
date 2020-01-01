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
}
