package org.fileoperations;

import java.io.File;
import java.util.Iterator;

//to get files from directory
public class GetFiles {
public static void main(String[] args) {
	File f = new File("C:\\\\Users\\\\god/JD");
	// to get files with their location in that folder
	 File[] list = f.listFiles();
   for (File file : list) {
	   System.out.println(file);

	
}   // to get files without location in that folder
   String[] list2 = f.list();
	for (String string : list2) {
		System.out.println(string);
	}
}
}
