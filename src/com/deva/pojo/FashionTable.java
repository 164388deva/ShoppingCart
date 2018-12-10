package com.deva.pojo;

public class FashionTable {
	 private String name;
	  private Double price;
	public FashionTable(String name, double s1) {
		super();
		this.name = name;
		this.price = s1;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "FashionTable [name=" + name + ", price=" + price + "]";
	}

}
