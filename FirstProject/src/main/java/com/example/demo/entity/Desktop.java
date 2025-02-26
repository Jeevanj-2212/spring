package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Desktop {
	String brand = "Apple";
	String varient = "Mac Book pro";
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}

	public void show() {
		System.out.println(brand + " "+varient);
	}
}
