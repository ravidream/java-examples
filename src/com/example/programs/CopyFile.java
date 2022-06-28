package com.example.programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile {
	public static void main(String args[]) {
		byte[] array = new byte[50];
		try {
			FileInputStream sourceFile = new FileInputStream("D:\\WORKSPACE\\input.txt");
			FileOutputStream destFile = new FileOutputStream("D:\\WORKSPACE\\newfile.txt");
			sourceFile.read(array);

			destFile.write(array);
			System.out.println("The input.txt file is copied to newFile");

			sourceFile.close();
			destFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}