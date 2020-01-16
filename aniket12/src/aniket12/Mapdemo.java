package aniket12;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
map.put("java",1000);
map.put("c",7000);
map.put("angular",5000);
map.put("Python",12000);
map.put("Python",6000);
map.containsKey("java");
		System.out.println(map);
		System.out.println(map.get("c"));
}

}
