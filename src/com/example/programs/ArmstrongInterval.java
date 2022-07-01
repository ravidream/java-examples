package com.example.programs;

public class ArmstrongInterval {
	public static void main(String args[]) {
		int low = 99, high = 999;
		for (int number = low + 1; high > number; number++) {
			int digit = 0;
			int result = 0;
			int originalnumber = number;
			while (originalnumber != 0) {
				originalnumber /= 10;
				digit++;
			}
			originalnumber = number;
			while (originalnumber != 0) {
				int remainder = originalnumber % 10;
				result += Math.pow(remainder, digit);
				originalnumber /= 10;
			}

			if (result == number)
				System.out.print(number + " ");
		}
	}

}
