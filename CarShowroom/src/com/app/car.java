package com.app;

import Enums.*;

public class car {
	private String chasisno;
	private double price;
	private Color color;
	private Category category;

	public car(String chasisno, double price, String c, Category category) {
		super();
		System.out.println("----ctor of car----");
		this.chasisno = chasisno;
		this.price = price;
		this.color = Color.valueOf(c.toUpperCase());
		this.category = category;
	}

	@Override
	public String toString() {
		return "car [chasisno=" + chasisno + ", price=" + price + ", color=" + color + ", category=" + category + "]";
	}
	

	public void setPrice(double price) {
		this.price = price;
	}

	public String getChasisno() {
		return chasisno;
	}
	
}
