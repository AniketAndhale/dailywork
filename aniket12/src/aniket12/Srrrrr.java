package aniket12;
import java.util.Scanner;
public class Srrrrr {
	    public static void main(String[] args) {
	        
	        System.out.println("Enter the string");
	        Scanner sc=new Scanner(System.in);
	        String a = sc.nextLine();
	        int len=a.length();
	        
	        char[] data;
	        int b;
	        
	        data= new char[len];
	        for(int i=0;i<len;i++)
	        {
	            data[i]=a.charAt(i);
	            //System.out.println(data[i]);
	            if(Character.isLowerCase(data[i]))
	            
	                {
	                int value='z'-a.charAt(i);
	                System.out.print((char)('a'+ value));
	                }
	            else
	            {
	                int value='Z'-a.charAt(i);
	                System.out.print((char)('A' + value));
	            }
	            
	        }
	        
	        
	    }
	}

