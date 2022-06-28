package com.example.programs;

/**
 * 
 * @author ravid
 *
 */
class CommissionOfPercentage {
	public static void main(String args[]) {
		double amount = 10000, commissionPercentage = 25;
		double commission = (commissionPercentage / 100) * amount;
		System.out.println("Commission amount : " + commission);
	}
}