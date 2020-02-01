package com.cts.training.model;

import java.io.Serializable;

public class Company implements Serializable{

	private static final long serialVersionUID = -6721988738619310856L;
	
	private int id;
	private String name;
	private String sector;
	private String ceoName;
	private double turnOver;
	private String brief;
	private String stock_code;
	private boolean activated;
	
	public Company() {
	}

	public Company(int id, String name, String sector, String ceoName, double turnOver,String brief,String stock_code,boolean activated) {
		super();
		this.id = id;
		this.name = name;
		this.sector = sector;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
		this.brief = brief;
		this.stock_code = stock_code;
		
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getStock_code() {
		return stock_code;
	}

	public void setStock_code(String stock_code) {
		this.stock_code = stock_code;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", sector=" + sector + ", ceoName=" + ceoName + ", turnOver="
				+ turnOver + ", brief=" + brief + ", stock_code=" + stock_code + ", activated=" + activated
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getSector()=" + getSector()
				+ ", getCeoName()=" + getCeoName() + ", getTurnOver()=" + getTurnOver() + ", getBrief()=" + getBrief()
				+ ", getStock_code()=" + getStock_code() + ", isActivated()=" + isActivated() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	

}
