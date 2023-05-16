package com.app.core;

import java.time.LocalDate;

import Enums.Color;
import Enums.Type;

public class Vehicle {

	private String chasisNo;
	private LocalDate date;
	private String company;
	private double basePrice;
	private Color color;
	private Type type;
	private double netPrice;

	public Vehicle(String chasisNo, LocalDate date, String company, double basePrice, Color color, Type type,
			double netPrice) {

		this.chasisNo = chasisNo;
		this.date = date;
		this.company = company;
		this.basePrice = basePrice;
		this.color = color;
		this.type = type;
		this.netPrice = basePrice + color.price;
	}

	public Type getType() {
		return type;
	}

	public double getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	public Vehicle(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", date=" + date + ", company=" + company + ", color=" + color
				+ ", type=" + type + ", netPrice=" + netPrice + "]";
	}

}
