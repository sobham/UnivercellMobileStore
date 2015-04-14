package com.univercellmobiles.app.util;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.univercellmobiles.app.beans.AccessoryStock;
import com.univercellmobiles.app.beans.Brand;
import com.univercellmobiles.app.service.AccessoryStockService;
import com.univercellmobiles.app.service.AccessoryStockServiceImpl;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		try {
			//EmployeeService emService = (EmployeeService) context.getBean("employeeService");
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			AccessoryStockService as = (AccessoryStockService) context.getBean("accessoryStockService");

			AccessoryStock accessoryStock = new AccessoryStock();

			accessoryStock.setAccModel("Sony");
			accessoryStock.setAccStockId("101");
			accessoryStock.setDp(10f);
			accessoryStock.setSp(100f);
		//	accessoryStock.setArrivalDate(null);
			accessoryStock.setPhmodelName("TS-11");
			//accessoryStock.setSoldDate(null);
			accessoryStock.setDesription("test");
			accessoryStock.setMargin("15");
			

			as.add(accessoryStock);
			System.out.println("Added to table");
			System.out.println("Before Update");
			System.out.println(as.getAllDetails().toString());

			accessoryStock.setDesription("Description of Sony");

			as.update(accessoryStock);

			System.out.println("after update");
			System.out.println(as.getAllDetails());
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
