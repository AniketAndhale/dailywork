package aniket12;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fileh2 {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		String path="c:\\users\\Dell\\Desktop\\program\\data.txt";
		//File file =new File(path);
		FileInputStream fin=new FileInputStream(path);
		FileOutputStream fout=new FileOutputStream("copied.txt");
		int i;
		while((i=fin.read()) != -1)
		{
			fout.write(i);
			System.out.println(i);
		}
		fin.close();
		fout.close();
	}
}
