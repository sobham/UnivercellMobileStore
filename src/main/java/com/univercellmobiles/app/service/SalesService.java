package com.univercellmobiles.app.service;

import java.util.List;

import com.univercellmobiles.app.beans.Sales;

public interface SalesService {
	
	public void add(Sales sales);
    public void update(Sales sales);
    public Sales getBySalesId(String saleId);
    public void delete(String saleId);
    public List<Sales>    getAllDetails();

}
