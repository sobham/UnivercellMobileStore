package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.AccModel;;

public interface AccModelDao {
	
	public void add(AccModel accModel);
    public void update(AccModel accModel);
    public AccModel getByAccModelId(String accModelId);
    public void delete(String accModelId);
    public List<AccModel>    getAllDetails();
    public List<String> getAllModelNames();

}
