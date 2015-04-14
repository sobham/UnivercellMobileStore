package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.Sales;

public interface SalesDao {
	
	public void add(Sales sales);
    public void update(Sales sales);
    public Sales getBySalesId(String saleId);
    public void delete(String saleId);
    public List<Sales>    getAllDetails();

}
