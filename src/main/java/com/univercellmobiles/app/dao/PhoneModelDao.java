package com.univercellmobiles.app.dao;

import java.util.List;

import com.univercellmobiles.app.beans.PhoneModel;

public interface PhoneModelDao {
	
	public void add(PhoneModel phoneModel);
    public void update(PhoneModel phoneModel);
    public PhoneModel getByModelName(String modelName);
    public void delete(String modelName);
    public List<PhoneModel>    getAllDetails();
    public List<String> getAllModelNames();
	public PhoneModel getByModelId(int modelId);
	public void delete(int modelId);

}
