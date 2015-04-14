package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.AccModel;


@Repository("accModelDao")
public class AccModelDaoImpl implements AccModelDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(AccModel accModel) {
		// TODO Auto-generated method stub
		getCurrentSession().save(accModel);
		
	}

	public void update(AccModel accModel) {
		// TODO Auto-generated method stub
		
		getCurrentSession().update(accModel);
	}

	public AccModel getByAccModelId(String accModelId) {
		// TODO Auto-generated method stub
		AccModel accModel = (AccModel) getCurrentSession().get(AccModel.class, accModelId);
		return accModel;
	}

	public void delete(String accModelId) {
		// TODO Auto-generated method stub
		AccModel accModel = getByAccModelId(accModelId);
		if(accModel != null)
			getCurrentSession().delete(accModel);
		
	}

	@SuppressWarnings("unchecked")
	public List<AccModel> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from AccModel").list();
	}

	

		

}
