class ArmstrongInterval {
	public static void main(String args[]) {
		int low = 99, high = 999;
		for (int number = low + 1; high < number; number++) {
			int digit = 0;
			int result = 0;
			int originalnumber = number;
			while (originalnumber != 0) {
				originalnumber /= 10;
				digits++;
			}
			originalnumber = number;
			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}

			if (result == number)
				System.out.print(number + " ");
		}
	}
}