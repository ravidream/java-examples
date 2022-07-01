package com.example.programs;

public class AddComplexNumber {

	int real, image;

	public AddComplexNumber(int r, int i) {
		this.real = r;
		this.image = i;
	}

	public void showC() {
		System.out.print(this.real + " +i" + this.image);
	}

	public static AddComplexNumber add(AddComplexNumber n1, AddComplexNumber n2) {

		AddComplexNumber res = new AddComplexNumber(0, 0);

		res.real = n1.real + n2.real;

		res.image = n1.image + n2.image;

		return res;
	}

	public static void main(String arg[]) {
		// creating two complex numbers

		AddComplexNumber c1 = new AddComplexNumber(4, 5);
		AddComplexNumber c2 = new AddComplexNumber(10, 5);

		// printing complex numbers
		System.out.print("First Complex number: ");
		c1.showC();

		System.out.print("\nSecond Complex number: ");
		c2.showC();

		// calling add() to perform addition
		AddComplexNumber res = add(c1, c2);

		// displaying addition
		System.out.println("\nAddition is :");
		res.showC();
	}
}
