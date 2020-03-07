package com.cts.training.stockpriceservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


public interface StockPriceService {
	public String  addStockPrice(StockPrice sp);
	public void deleteStockPrice(int id);
	public String updateStockPrice(StockPrice sp);
	public StockPrice getStockPriceById(int id);

	public List<StockPrice> getAllStockPrice();
	public  ImportSummary addStockPriceFromExcelSheet(MultipartFile file) throws Exception;
		
	
}
