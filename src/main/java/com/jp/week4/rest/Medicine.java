package com.jp.week4.rest;

public class Medicine {

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDatedue() {
		return datedue;
	}

	public void setDatedue(String datedue) {
		this.datedue = datedue;
	}

	public Medicine(int id, String name, String description, String price, String datedue) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.datedue = datedue;
	}

	private int id;
	private String name;
	private String description;
	private String price;
	private String datedue;
	

    public Medicine() {}
	
	
}
