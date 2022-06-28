package com.example.programs;

import java.io.File;

class CreateDirectory {
	public static void main(String args[]) {
		File file = new File("D:\\WORKSPACE\\test");
		boolean value = file.mkdir();
		if (value) {
			System.out.println("The directory is created");
		} else {
			System.out.println("The directory is already exist");
		}
	}
}