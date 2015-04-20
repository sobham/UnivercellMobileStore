package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.AccModel;
import com.univercellmobiles.app.dao.AccModelDao;

@Service("accModelService")
@Transactional
public class AccModelServiceImpl  implements AccModelService{
	
	@Autowired
	AccModelDao accModelDao ;

	public void add(AccModel accModel) {
		// TODO Auto-generated method stub
		accModelDao.add(accModel);
		
	}

	public void update(AccModel accModel) {
		// TODO Auto-generated method stub
		accModelDao.update(accModel);
		
	}

	public AccModel getByAccModelId(String accModelId) {
		// TODO Auto-generated method stub
		return accModelDao.getByAccModelId(accModelId);
	}

	public void delete(String accModelId) {
		// TODO Auto-generated method stub
		accModelDao.delete(accModelId);
		
	}

	public List<AccModel> getAllDetails() {
		// TODO Auto-generated method stub
		return accModelDao.getAllDetails();
	}

	public List<String> getAllModelNames() {
		// TODO Auto-generated method stub
		return accModelDao.getAllModelNames();
	}

}
