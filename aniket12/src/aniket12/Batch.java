package aniket12;

public class Batch {
	
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String s="Global Warming";
		
		System.out.println(s.substring(10));//a
		System.out.println(s.substring(4,8));//b
		System.out.println(s.indexOf("Wa"));//f
		System.out.println(s.toLowerCase());//g
		System.out.println(s.replace("a","*"));//i
		System.out.println(s.matches("[a-zA-Z0-9]+"));//c
		System.out.println(s.substring(3,14));//e
		System.out.println(s.substring(0,s.length()-4));//d
	}
	

}
