package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.Invoice;

public interface InvoiceDao {
	
	public void add(Invoice Invoice);
    public void update(Invoice Invoice);
    public Invoice getByInvoiceId(String invoiceId);
    public void delete(String invoiceId);
    public List<Invoice>    getAllDetails();

}
