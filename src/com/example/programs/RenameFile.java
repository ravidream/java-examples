package com.example.programs;

import java.io.File;

class RenameFile {
	public static void main(String args[]) {

		File oldName = new File("C:/program.txt");
		File newName = new File("C:/java.txt");

		if (oldName.renameTo(newName)) {
			System.out.println("renamed");
		} else {
			System.out.println("Error");
		}
	}
}