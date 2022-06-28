package com.example.programs;

class LargestArray {
	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			if (a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return a[total - 1];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 43, 55, 39, 29, 89, 88 };
		System.out.println("Largest:" + getLargest(a, 6));
		System.out.println("Largest:" + getLargest(b, 6));
	}
}