package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.Distributor;
import com.univercellmobiles.app.dao.DistributorDao;


@Service
@Transactional
public class DistributorServiceImpl implements DistributorService{
	@Autowired
	DistributorDao distributorDao;

	public void add(Distributor distributor) {
		// TODO Auto-generated method stub
		distributorDao.add(distributor);
		
	}

	public void update(Distributor distributor) {
		// TODO Auto-generated method stub
		distributorDao.update(distributor);
		
	}

	public Distributor getByDistributorId(String distId) {
		// TODO Auto-generated method stub
		return distributorDao.getByDistributorId(distId);
	}

	public void delete(String distId) {
		// TODO Auto-generated method stub
		distributorDao.delete(distId);
		
	}

	public List<Distributor> getAllDetails() {
		// TODO Auto-generated method stub
		return distributorDao.getAllDetails();
	}

}
