package aniket12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDe {
	public static Object deserialization(String filename) throws IOException, ClassNotFoundException
	{
		FileInputStream fin =new FileInputStream(filename);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream oin =new ObjectInputStream(bin);
		Object obj =oin.readObject();
		return obj;
		
	}
	public static void serializable (Object obj,String filename) throws IOException {
		FileOutputStream fout=new FileOutputStream(filename);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out=new ObjectOutputStream(bout);
		out.close();
		bout.close();
		fout.close();
	}
public static void main(String[] args) {
	Employee1 employee =new Employee1(111,"sai","kolhapur",22,55885688L,5284.00);
	try {
		serializable(employee,"serial.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
