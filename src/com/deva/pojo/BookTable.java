package com.deva.pojo;

public class BookTable {
	 private String name;
	  private Double price;
	public BookTable(String name, double s1) {
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
		return "BookTable [name=" + name + ", price=" + price + "]";
	}
}
