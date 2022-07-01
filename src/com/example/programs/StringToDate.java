package com.example.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
	public static void main(String args[]) throws Exception {
		String sDate1 = "01/07/2022";
		Date date1 = new SimpleDateFormat("dd/MM/YY").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);
	}

}
