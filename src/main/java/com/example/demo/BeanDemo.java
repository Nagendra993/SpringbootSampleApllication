package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class BeanDemo {

	private int id;
	private String name;
	
	@Autowired
	@Qualifier("child")
	private BeanChild bean;

	public BeanChild getBean() {
		return bean;
	}

	public void setBean(BeanChild bean) {
		this.bean = bean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanDemo [id=" + id + ", name=" + name + ", bean=" + bean + "]";
	}

	

	
}
