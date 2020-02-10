package com.cts.training.model;

public class Account {
	private String acno;
	private String ifsc;
	private String branch;
	private long transfer;
	/*
	 * public Account(String acno, String ifsc, String branch, long transfer) {
	 * super(); this.acno = acno; this.ifsc = ifsc; this.branch = branch;
	 * this.transfer = transfer;
	 * }
	 */
	
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getTransfer() {
		return transfer;
	}
	public void setTransfer(long transfer) {
		this.transfer = transfer;
	}
	@Override
	public String toString() {
		return "Account [acno=" + acno + ", ifsc=" + ifsc + ", branch=" + branch + ", transfer=" + transfer + "]";
	}
	
	
	
	

}
