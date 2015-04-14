package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.Brand;

public interface BrandDao {
	
	public void add(Brand brand);
    public void update(Brand brand);
    public Brand getByBrandId(int brandId);
    public void delete(int brandId);
    public List<Brand>    getAllDetails();
	public List<String> getAllBrandNames();

}
