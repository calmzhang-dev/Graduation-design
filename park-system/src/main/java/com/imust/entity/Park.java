package com.imust.entity;

public class Park {
	private int id;
	private String name;
	private int status;
	private double price;
	private int pkId;
	private String praklotName;

	public int getPkId() {
		return pkId;
	}

	public void setPkId(int pkId) {
		this.pkId = pkId;
	}

	public String getPraklotName() {
		return praklotName;
	}

	public void setPraklotName(String praklotName) {
		this.praklotName = praklotName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
