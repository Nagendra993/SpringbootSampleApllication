package com.example.demo;

public class BeanChild {

	private String college;
	private String address;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "BeanChild [college=" + college + ", address=" + address + "]";
	}

	
}
