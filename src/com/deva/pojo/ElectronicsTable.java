package com.deva.pojo;

public class ElectronicsTable {
	 private String name;
	  private Double price;
	public ElectronicsTable(String name, double s1) {
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
		return "Electronics Table [name=" + name + ", price=" + price + "]";
	}

}
