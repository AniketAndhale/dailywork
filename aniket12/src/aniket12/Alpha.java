package aniket12;

public class Alpha {
	public static void main(String[] args) {
		 String name= new String("aniket");
		 String adress= new String("metukuppam"); 
		 String adress1= new String("maha"); 
		 String name3=new String("hydra");
		 String name1=new String ("anu");
		 System.out.println(name==name3);
		 String name2="thoripakkam";
		 String name4="thoripakkam";
		 System.out.println(name2==name4);
		 System.out.println(name.contentEquals(name2));
		 System.out.println(adress==adress1);
	
		 String date="Thursday 9 january 2020";
		 for(int i=0;i<date.length();i++) 
		 {
		 String[] d1=date.split("\\d");
				 
		 		System.out.println(d1[i]);
	}
	}

}
