package com.univercellmobiles.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univercellmobiles.app.beans.AccessoryStock;
import com.univercellmobiles.app.dao.AccessoryStockDao;

@Service("accessoryStockService")
@Transactional
public class AccessoryStockServiceImpl  implements AccessoryStockService {
	
	@Autowired
	AccessoryStockDao accessoryStockDao ;

	public void add(AccessoryStock accessoryStock) {
		System.out.println("In Dao" + accessoryStock.toString());
		// TODO Auto-generated method stub
		 accessoryStockDao.add(accessoryStock);
		
	}

	public void update(AccessoryStock accessoryStock) {
		// TODO Auto-generated method stub
		accessoryStockDao.update(accessoryStock);
		
	}

	public AccessoryStock getByAccStockId(String accStockId) {
		// TODO Auto-generated method stub
		return accessoryStockDao.getByAccStockId(accStockId);
	}

	public void delete(String accStockId) {
		// TODO Auto-generated method stub
		accessoryStockDao.delete(accStockId);
		
	}

	public List<AccessoryStock> getAllDetails() {
		// TODO Auto-generated method stub
		return accessoryStockDao.getAllDetails();
	}

}
