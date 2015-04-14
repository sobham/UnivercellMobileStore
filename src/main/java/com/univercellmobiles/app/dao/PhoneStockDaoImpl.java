package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.PhoneStock;

@Repository("phoneStockDao")
public class PhoneStockDaoImpl implements PhoneStockDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(PhoneStock phoneStock) {
		// TODO Auto-generated method stub
		getCurrentSession().save(phoneStock);
	}

	public void update(PhoneStock phoneStock) {
		// TODO Auto-generated method stub

		getCurrentSession().update(phoneStock);

	}

	public PhoneStock getByPhoneStockId(int phStockId) {
		// TODO Auto-generated method stub
		PhoneStock phoneStock = (PhoneStock) getCurrentSession().get(
				PhoneStock.class, phStockId);
		return phoneStock;
	}

	public void delete(int phStockId) {
		// TODO Auto-generated method stub
		PhoneStock phoneStock = getByPhoneStockId(phStockId);
		if (phoneStock != null)
			getCurrentSession().delete(phoneStock);

	}
	
	public int sellStock(int phStockId) {
		// TODO Auto-generated method stub
		PhoneStock phoneStock = getByPhoneStockId(phStockId);
		if (phoneStock != null){
			int stockAvailable=phoneStock.getAvailable();
			if(stockAvailable>0){
				phoneStock.setAvailable(stockAvailable-1);
			}
			getCurrentSession().update(phoneStock);
		}
		return 0;

	}

	@SuppressWarnings("unchecked")
	public List<PhoneStock> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from PhoneStock").list();
	}
	
	public List<PhoneStock> getAllAvailable() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from PhoneStock where available>0").list();
	}

	



}