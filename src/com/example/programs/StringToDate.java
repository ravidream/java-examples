package com.example.programs;

import java.text.SimpleDateFormat;
import java.util.Date;

class StringToDate {
	public static void main(String args[]) throws Exception {
		String sDate1 = "31/12/2019";
		Date date1 = new SimpleDateFormat("dd/MM/YY").parse(sDate1);
		System.out.println(sDate1 + "\t" + date1);
	}
}