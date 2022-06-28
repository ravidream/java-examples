package com.example.programs;

import java.io.File;
import java.util.*;

class ListFileDirectory {
	public static void main(String args[]) {
		File dir = new File("C:\\");
		String[] children = dir.list();

		if (children == null) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
