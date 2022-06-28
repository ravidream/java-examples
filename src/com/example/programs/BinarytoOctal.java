package com.example.programs;

class BinarytoOctal {
	public static void main(String args[]) {
		String number = "10101";
		int binarynum = Integer.parseInt(number);
		String ostr = Integer.toOctalString(binarynum);
		System.out.println("Cctal value after conversion is :" + ostr);
	}
}