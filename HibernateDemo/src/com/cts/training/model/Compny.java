package com.cts.training.model;

import java.io.Serializable;


public class Compny implements Serializable
{
	private int id;
	private  String sector;
	private String name;
	private String ceoName;
	private double turnover;
	


public Compny()
{
	
}



public Compny(int id, String name,String sector, String ceoName, double turnover) {
	super();
	this.id = id;
	this.sector = sector;
	this.name = name;
	this.ceoName = ceoName;
	this.turnover = turnover;
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



public double getTurnover() {
	return turnover;
}



public void setTurnover(double turnover) {
	this.turnover = turnover;
}

}