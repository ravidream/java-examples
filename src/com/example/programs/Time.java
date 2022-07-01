package com.example.programs;

public class Time {
	int seconds;
	int minutes;
	int hours;

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public static void main(String args[])

	{
		Time start = new Time(12, 34, 55);
		Time stop = new Time(8, 12, 15);
		Time diff;
		diff = timeDifference(start, stop);
		System.out.println("Starting time is " + start.hours + ":" + start.minutes + ":" + start.seconds);
		System.out.println("Stop time is " + stop.hours + ":" + stop.minutes + ":" + stop.seconds);
		System.out.println("Time difference is " + diff.hours + ":" + diff.minutes + ":" + diff.seconds);
	}

	public static Time timeDifference(Time start, Time stop) {
		Time diff = new Time(0, 0, 0);
		if (stop.seconds > start.seconds) {
			--start.minutes;
			start.seconds += 60;
		}

		diff.seconds = start.seconds - stop.seconds;
		if (stop.minutes > start.minutes) {
			--start.hours;
			start.minutes += 60;
		}
		diff.minutes = start.minutes - stop.minutes;
		diff.hours = start.hours - stop.hours;
		return (diff);
	}

}
