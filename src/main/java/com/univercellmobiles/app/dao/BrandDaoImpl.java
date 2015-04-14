package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.Brand;

@Repository("brandDao")
public class BrandDaoImpl implements BrandDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(Brand brand) {
		// TODO Auto-generated method stub
		getCurrentSession().save(brand);

	}

	public void update(Brand brand) {
		// TODO Auto-generated method stub

		getCurrentSession().update(brand);

	}

	public Brand getByBrandId(int brandId) {
		// TODO Auto-generated method stub
		Brand brand = (Brand) getCurrentSession().get(Brand.class, brandId);
		return brand;
	}

	public void delete(int brandId) {
		// TODO Auto-generated method stub
		Brand brand = getByBrandId(brandId);
		if (brand != null)
			getCurrentSession().delete(brand);
	}

	@SuppressWarnings("unchecked")
	public List<Brand> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from Brand").list();
	}

	public List<String> getAllBrandNames() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("select brandName from Brand").list();
	}

}
