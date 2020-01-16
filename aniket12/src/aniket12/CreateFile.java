package aniket12;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter; 
public class CreateFile {
	  public static void main(String[] args) throws IOException 
	    { 
	      
	        String str = "File Handling in Java using "+ 
	                " FileWriter and FileReader"; 
	  
	    
	        FileWriter fw=new FileWriter("data.txt"); 
	  
	        for (int i = 0; i < str.length(); i++) 
	            fw.write(str.charAt(i)); 
	  
	        System.out.println("Writing successful"); 
	      
	        fw.close(); 
	    } 

}
