package aniket12;
import java.util.Scanner;

public class Nosum {

    public static void main(String[] args) {
    
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int r=0,sum=0;
        while(num>0 || sum>=10)
        {
             if (num==0) { 
                    num=sum; 
                    sum=0; 
                    } 
            
            r=num%10;
            sum=sum+r;
            num=num/10;
            
        
        }
    System.out.println(sum);
        
        
    }
}


