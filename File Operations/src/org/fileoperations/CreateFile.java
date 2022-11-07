package org.fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\god/JD/mahesh.xml");
		  boolean createNewFile = f.createNewFile();
		  System.out.println(createNewFile);
		  boolean file = f.isFile();
		  System.out.println(file);
			boolean exists = f.exists();
			System.out.println(exists);
			boolean directory = f.isDirectory();
			System.out.println(directory);
	}

}
