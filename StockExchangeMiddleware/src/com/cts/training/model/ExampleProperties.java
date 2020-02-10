package com.cts.training.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ExampleProperties {

	public static void main(String[] args) throws FileNotFoundException {
		Properties properties = new Properties();
		
		FileInputStream fin=new FileInputStream("src\\prop.properties.txt");
		try {
			properties.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Username: "+properties.getProperty("username"));
		Properties p=System.getProperties();
		System.out.println(p);
		
		Set<Entry<Object, Object>> set =p.entrySet();
		for(Map.Entry<Object, Object> entry:set)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		

		}
}
