package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.Customer;
import com.univercellmobiles.app.dao.CustomerDao;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.add(customer);
		
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.update(customer);
		
	}

	public Customer getByCustomerId(String custId) {
		// TODO Auto-generated method stub
		return customerDao.getByCustomerId(custId);
	}

	public void delete(String custId) {
		// TODO Auto-generated method stub
		customerDao.delete(custId);
		
	}

	public List<Customer> getAllDetails() {
		// TODO Auto-generated method stub
		return customerDao.getAllDetails();
	}

}
