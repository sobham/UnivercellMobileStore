package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.PhoneStock;

public interface PhoneStockDao {
	
	public void add(PhoneStock phoneStock);
    public void update(PhoneStock phoneStock);
    public PhoneStock getByPhoneStockId(int phStockId);
    public void delete(int phStockId);
    public int sellStock(int phStockId);
    public List<PhoneStock>    getAllDetails();
    public List<PhoneStock> getAllAvailable();

}
