package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.Customer;
@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
		
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		getCurrentSession().save(customer);
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
		getCurrentSession().update(customer);
		
	}

	public Customer getByCustomerId(String custId) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) getCurrentSession().get(Customer.class, custId);
		return customer;
	}

	public void delete(String custId) {
		// TODO Auto-generated method stub
		Customer customer = getByCustomerId(custId);
		if(customer != null)
			getCurrentSession().delete(custId);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from Customer").list();
	}

}
