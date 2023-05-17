package com.mmhernandez.fruityloops.models;

public class FruityLoopsItem {

	private String name;
	private double price;
	
//	CONSTRUCTORS
	public FruityLoopsItem() {
		this.name = "";
		this.price = 0;
	}
	public FruityLoopsItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
//	GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
