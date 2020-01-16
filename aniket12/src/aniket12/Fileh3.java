package aniket12;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.FileSystem;
import java.nio.file.Path;
public class Fileh3 {
	public static void main(String[] args) throws IOException {
	
		//path interface,which is used to create path
		FileSystem fs =FileSystems.getDefault();
		//Path path =fs.getPath("C:\\Users\\Dell\\Desktop\\Aniket");
		Path path =Paths.get("C:\\Users\\Dell\\Desktop\\Aniket");
		Path out =Path.get("C:\Users\Dell\Desktop\program");
		System.out.println("name cout:"+path.getNameCount());
		System.out.println("is Absolute : "+path.isAbsolute());
		System.out.println("name on Index 2 : "+path.getName(2));
		//Files files =Files.createFile("C:\\Users\\Dell\\Desktop\\Aniket");
		Files.createFile(path);
		Files.createDirectory(path);
		File.
		Files.exists(path);
		Files.notExists(path);
		Files.copy(path, out);
	
	}

}
