package com.univercellmobiles.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univercellmobiles.app.beans.Invoice;

@Repository("invoiceDao")
public class InvoiceDaoImpl implements InvoiceDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(Invoice invoice) {
		// TODO Auto-generated method stub
		getCurrentSession().save(invoice);

	}

	public void update(Invoice invoice) {
		// TODO Auto-generated method stub

		getCurrentSession().update(invoice);
	}

	public Invoice getByInvoiceId(String invoiceId) {
		// TODO Auto-generated method stub
		Invoice invoice = (Invoice) getCurrentSession().get(Invoice.class,
				invoiceId);
		return invoice;
	}

	public void delete(String invoiceId) {
		// TODO Auto-generated method stub
		Invoice invoice = getByInvoiceId(invoiceId);
		if (invoice != null)
			getCurrentSession().delete(invoice);
	}

	@SuppressWarnings("unchecked")
	public List<Invoice> getAllDetails() {
		// TODO Auto-generated method stub
		return getCurrentSession().createQuery("from Invoice").list();
	}

}
