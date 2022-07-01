package com.example.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("4");

		String[] array = new String[list.size()];
		list.toArray(array);

		System.out.println(Arrays.toString(array));
	}

}
