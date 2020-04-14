package com.project.bakery.models;

public class Product {
	private String name;
	private String code;
	private Integer packSize;
	private Float price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getPackSize() {
		return packSize;
	}
	public void setPackSize(Integer packSize) {
		this.packSize = packSize;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
}
