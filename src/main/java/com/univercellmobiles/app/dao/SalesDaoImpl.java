package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.Sales;

@Repository("salesDao")
public class SalesDaoImpl implements SalesDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(Sales sales) {
		// TODO Auto-generated method stub
		getCurrentSession().save(sales);

	}

	public void update(Sales sales) {
		// TODO Auto-generated method stub

		getCurrentSession().update(sales);
	}

	public Sales getBySalesId(String saleId) {
		// TODO Auto-generated method stub
		Sales sales = (Sales) getCurrentSession().get(Sales.class, saleId);
		return sales;
	}

	public void delete(String saleId) {
		// TODO Auto-generated method stub
		Sales sales = getBySalesId(saleId);
		if (sales != null)
			getCurrentSession().delete(sales);

	}

	@SuppressWarnings("unchecked")
	public List<Sales> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from Sales").list();
	}

}
