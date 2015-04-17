package com.univercellmobiles.app.util;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigBuilder {
	static ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	public static ConfigurableApplicationContext getAppContext(){
		
		return context;
	}

}
