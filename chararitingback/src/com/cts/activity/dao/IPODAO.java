package com.cts.activity.dao;

import java.util.List;

import com.cts.activity.bean.IPO;

public interface IPODAO {
	
	public boolean saveIPO(IPO ipo);
	
	public boolean updateIPO(IPO ipo);
	
	public boolean deleteIPO(IPO ipo);
	
	public IPO getIPOById(int id);
	
	public List<IPO> displayAllIPOs();

}
