package com.univercellmobiles.app.service;

import java.util.List;

import com.univercellmobiles.app.beans.Distributor;

public interface DistributorService{
	
	public void add(Distributor distributor);
    public void update(Distributor distributor);
    public Distributor getByDistributorId(String distId);
    public void delete(String distId);
    public List<Distributor>    getAllDetails();

}
