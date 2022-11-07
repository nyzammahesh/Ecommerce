package org.fileoperations;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\god/JDail");
		// To create new folder
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		// to check file
		boolean directory = f.isDirectory();
		System.out.println(directory);
		boolean exists = f.exists();
		System.out.println(exists);
	




	}

}
