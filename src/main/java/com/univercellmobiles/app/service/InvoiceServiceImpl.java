package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.Invoice;
import com.univercellmobiles.app.dao.InvoiceDao;

@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService{
	
	@Autowired
	InvoiceDao invoiceDao;

	public void add(Invoice Invoice) {
		// TODO Auto-generated method stub
		invoiceDao.add(Invoice);
		
	}

	public void update(Invoice Invoice) {
		// TODO Auto-generated method stub
		invoiceDao.update(Invoice);
		
	}

	public Invoice getByInvoiceId(String invoiceId) {
		// TODO Auto-generated method stub
		return invoiceDao.getByInvoiceId(invoiceId);
	}

	public void delete(String invoiceId) {
		// TODO Auto-generated method stub
		invoiceDao.delete(invoiceId);
		
	}

	public List<Invoice> getAllDetails() {
		// TODO Auto-generated method stub
		return invoiceDao.getAllDetails();
	}

}
