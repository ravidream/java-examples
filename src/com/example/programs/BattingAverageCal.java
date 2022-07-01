package com.example.programs;

public class BattingAverageCal {
	public static void main(String args[]) {
		int matches = 5, total_run = 200, innings = 5, notout = 1;

		double avg;

		avg = total_run / (innings - notout);

		System.out.println("Batting average : " + avg);
	}

}
