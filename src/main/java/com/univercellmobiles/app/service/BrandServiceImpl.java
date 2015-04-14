package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.Brand;
import com.univercellmobiles.app.dao.BrandDao;

@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService {
	@Autowired
	BrandDao brandDao;

	public void add(Brand brand) {
		// TODO Auto-generated method stub
		brandDao.add(brand);
		
	}

	public void update(Brand brand) {
		// TODO Auto-generated method stub
		brandDao.update(brand);
		
	}

	public Brand getByBrandId(int brandId) {
		// TODO Auto-generated method stub
		return brandDao.getByBrandId(brandId);
	}

	public void delete(int brandId) {
		// TODO Auto-generated method stub
		brandDao.delete(brandId);
		
	}

	public List<Brand> getAllDetails() {
		// TODO Auto-generated method stub
		return brandDao.getAllDetails();
	}

	public List<String> getAllBrandNames() {
		// TODO Auto-generated method stub
		return brandDao.getAllBrandNames();
	}

}
