package aniket12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Fileh {
	public static void main(String[] args) throws FileNotFoundException,IOException{
		String path="c:\\users\\Dell\\Desktop\\program\\data.txt";
		File file =new File(path);
		System.out.println("can execute?:"+file.canExecute());
		System.out.println("can read:"+file.canRead());
		System.out.println("file write:"+file.canWrite());
		System.out.println("File exist:"+file.exists());
		System.out.println("Absolute path:"+file.getAbsolutePath()  );
		FileOutputStream fout=new FileOutputStream(file,true);
		Scanner in=new Scanner(System.in);
		String message=in.nextLine();
		//String msg="welcome";
		//byte [] b=msg.getBytes();
		byte [] b=message.getBytes();
		fout.write(b);
		fout.close();
		
	}
}
