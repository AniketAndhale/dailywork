package com.cts.arichpro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	addNames(names);
	names.forEach(System.out::println);
	List<String> lengthScale =names.stream().filter(name->name.length()>=7).collect(Collectors.toList());
	System.out.println("The Names which lenght greater than 7:\n");
	lengthScale.forEach(System.out::println);
	List<String> capNames = names.stream().map(name->.toUpperCase()).collect(Collectors.toList());
	
}
private static void addNames(List<String> names)
{
	names.add("abin joshy");
	names.add("aniket andhale");
	names.add("sai");
	
}
}
