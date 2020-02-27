package com.cts.project.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "comparecompany")
@XmlRootElement(name = "comparecompanylist")

public class CompareCompany {
	@Id
	@GeneratedValue
	private int id;
	private String selectcompany;
	private String selectstock;
	private String companyname;
	private Date fperiod;
	private Date tperiod;
	
	public CompareCompany()
	{
		
	}

	public CompareCompany(int id, String selectcompany, String selectstock, String companyname, Date fperiod,
			Date tperiod) {
		super();
		this.id = id;
		this.selectcompany = selectcompany;
		this.selectstock = selectstock;
		this.companyname = companyname;
		this.fperiod = fperiod;
		this.tperiod = tperiod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSelectcompany() {
		return selectcompany;
	}

	public void setSelectcompany(String selectcompany) {
		this.selectcompany = selectcompany;
	}

	public String getSelectstock() {
		return selectstock;
	}

	public void setSelectstock(String selectstock) {
		this.selectstock = selectstock;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Date getFperiod() {
		return fperiod;
	}

	public void setFperiod(Date fperiod) {
		this.fperiod = fperiod;
	}

	public Date getTperiod() {
		return tperiod;
	}

	public void setTperiod(Date tperiod) {
		this.tperiod = tperiod;
	}
	
	

}
