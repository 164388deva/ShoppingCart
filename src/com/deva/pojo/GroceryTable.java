package com.deva.pojo;

public class GroceryTable {
  private String name;
  private Double price;
public GroceryTable(String name, double s1) {
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
	return "GroceryTable [name=" + name + ", price=" + price + "]";
}

  
}
