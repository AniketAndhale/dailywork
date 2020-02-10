package com.cts.training.model;

public class Customer {
	private int id;
	private  String name; 
	private String acno;
	private String ifsc;
	private String address;
	private String branch;
	private String withdraw;
	private String deposit;
	private Account account;
	
	
	public Customer()
	{
		
	}

	/*
	 * public Customer(int id, String name, String acno, String ifsc, String
	 * address,String branch,String deposit,String withdraw ,Account account) {
	 * super(); this.id = id; this.name = name; this.acno = acno; this.ifsc = ifsc;
	 * this.address = address; this.branch=branch; this.withdraw=withdraw;
	 * this.deposit=deposit; this.account=account; }
	 */

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

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

	public String getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", acno=" + acno + ", ifsc=" + ifsc + ", address=" + address
				+ ", branch=" + branch + ", withdraw=" + withdraw + ", deposit=" + deposit + "]";
	}

	
	
	
	

}
