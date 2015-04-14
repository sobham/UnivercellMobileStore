package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.AccessoryStock;

@Repository("accessoryStockDao")
public class AccessoryStockDaoImpl implements AccessoryStockDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(AccessoryStock accessoryStock) {
		// TODO Auto-generated method stub
		getCurrentSession().save(accessoryStock);
		
	}

	public void update(AccessoryStock accessoryStock) {
		// TODO Auto-generated method stub
		//AccessoryStock accessoryStockFromDb = getByAccStockId(accessoryStock.getAccStockId());
		getCurrentSession().update(accessoryStock);
		
	}

	public AccessoryStock getByAccStockId(String accStockId) {
		// TODO Auto-generated method stub
		AccessoryStock acessoryStock = (AccessoryStock) getCurrentSession().get(AccessoryStock.class, accStockId);
		return acessoryStock;
	}

	public void delete(String accStockId) {
		// TODO Auto-generated method stub
		AccessoryStock accessoryStock = getByAccStockId(accStockId);
		if(accessoryStock != null)
			getCurrentSession().delete(accessoryStock);
		
	}

	@SuppressWarnings("unchecked")
	public List<AccessoryStock> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from AccessoryStock").list();
	}

		

}
