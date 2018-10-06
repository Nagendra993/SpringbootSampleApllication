package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		
		BeanDemo b= (BeanDemo) context.getBean("bean");
		
		System.out.println(b);
	}
	
	@Bean
	public BeanChild child() {
		
		BeanChild b=new BeanChild();
		b.setAddress("hyd");
		b.setCollege("svcet");
	return b;	
	}	
	
	@Bean
	public BeanDemo bean() {
		
		BeanDemo b=new BeanDemo();
		b.setId(559);
		b.setName("nagendra");
		return b;
	}
	
	
	
	
	
	
}
