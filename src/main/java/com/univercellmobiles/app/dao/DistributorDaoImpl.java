package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.univercellmobiles.app.beans.Distributor;
@Repository("distributorDao")
public class DistributorDaoImpl implements DistributorDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(Distributor distributor) {
		// TODO Auto-generated method stub
		getCurrentSession().save(distributor);
		
	}

	public void update(Distributor distributor) {
		// TODO Auto-generated method stub
	
		getCurrentSession().update(distributor);
		
	}

	public Distributor getByDistributorId(String distId) {
		// TODO Auto-generated method stub
		Distributor distributor = (Distributor) getCurrentSession().get(Distributor.class, distId);
		return distributor;
	}

	public void delete(String distId) {
		// TODO Auto-generated method stub
		Distributor distributor = getByDistributorId(distId);
		if(distributor != null)
			getCurrentSession().delete(distId);
		
	}

	@SuppressWarnings("unchecked")
	public List<Distributor> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from Distributor").list();
	}

}
