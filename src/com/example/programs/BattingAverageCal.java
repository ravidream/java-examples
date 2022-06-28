package com.example.programs;

class BattingAverageCal {
	public static void main(String args[]) {
		int mateches = 5, totalrun = 200, innings = 5, notout = 1;

		double avg;

		avg = totalrun / (innings - notout);

		System.out.println("Batting average : " + avg);
	}
}