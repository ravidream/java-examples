package com.example.programs;

public class BinarytoOctal {
	public static void main(String args[]) {
		String number = "10101";
		int binary_num = Integer.parseInt(number);
		System.out.println("input binary no is 10101 which is now converted to decimal due to parsing "+ binary_num);
		String ostr = Integer.toOctalString(binary_num);
		System.out.println("octal value after conversion is :" + ostr);
	}

}
