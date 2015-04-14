package com.univercellmobiles.app.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.univercellmobiles.app.service.AccessoryStockService;
 

public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    public static final ConfigurableApplicationContext context = getConfig();
	
 
    private static ConfigurableApplicationContext getConfig(){
    	
    	
    	try {
    		
    		 return new  ClassPathXmlApplicationContext("applicationContext.xml");
    		
    	} catch (Throwable ex) {
            System.err.println("Initial Context  failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
	

	public static ConfigurableApplicationContext getContext() {
		return context;
	}

	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration()
            		.configure()
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
}
