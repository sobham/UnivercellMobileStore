package com.univercellmobiles.app.service;

import java.util.List;

import com.univercellmobiles.app.beans.PhoneModel;

public interface PhoneModelService { 
	
	public void add(PhoneModel phoneModel);
    public void update(PhoneModel phoneModel);
    public PhoneModel getByModelName(String modelName);
    public PhoneModel getByModelId(int modelId);
    public void delete(int modelId);
    public List<PhoneModel>    getAllDetails();
    public List<String> getAllModelNames();

}
