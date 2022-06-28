package com.example.programs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class ExistingFile {
	public static void main(String args[]) {
		String path = System.getProperty("user.dir") + "\\test.txt";
		String text = "Added";
		try {
			Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {

		}
	}
}