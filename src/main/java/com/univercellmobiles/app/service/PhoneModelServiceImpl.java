package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.PhoneModel;
import com.univercellmobiles.app.dao.PhoneModelDao;


@Service("phoneModelService")
@Transactional
public class PhoneModelServiceImpl implements PhoneModelService {
	
	
	@Autowired
	PhoneModelDao  phoneModelDao;

	public void add(PhoneModel phoneModel) {
		// TODO Auto-generated method stub
		phoneModelDao.add(phoneModel);
	}

	public void update(PhoneModel phoneModel) {
		// TODO Auto-generated method stub
		phoneModelDao.update(phoneModel);
		
	}

	public PhoneModel getByModelName(String modelName) {
		// TODO Auto-generated method stub
		return phoneModelDao.getByModelName(modelName);
	}


	public List<PhoneModel> getAllDetails() {
		// TODO Auto-generated method stub
		return phoneModelDao.getAllDetails();
	}
	
	public List<String> getAllModelNames() {
		// TODO Auto-generated method stub
		return phoneModelDao.getAllModelNames();
	}

	public PhoneModel getByModelId(int modelId) {
		// TODO Auto-generated method stub
		return phoneModelDao.getByModelId(modelId);
	}

	public void delete(int modelId) {
		// TODO Auto-generated method stub
		phoneModelDao.delete(modelId);
		
	}

}
