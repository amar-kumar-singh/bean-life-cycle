package com.bean.exmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.exmp.domain.AwareBeanImpl;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleApplication.class, args);
		
		
		// -------awareinterfaces---------
		@SuppressWarnings("resource")
		ApplicationContext  context1 =
		new ClassPathXmlApplicationContext("beans.xml");
		@SuppressWarnings("unused")
		AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context1.getBean("awareBean");
		((AbstractApplicationContext) context1).registerShutdownHook();
	
	}

}
