package com.example.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
	public static void main(String args[]) {
		SimpleDateFormat Formatter = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS");
		Date date = new Date();
		System.out.println(Formatter.format(date));
	}

}
