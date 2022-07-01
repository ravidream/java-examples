package com.example.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileToByteArray {
	public static void main(String args[]) {

		try {
			File file = new File("D:\\WORKSPACE\\input.txt");
			FileInputStream fis;
			fis = new FileInputStream(file);
			byte[] bytesArray = new byte[(int) file.length()];
			fis.read(bytesArray);

			String s = new String(bytesArray);
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
