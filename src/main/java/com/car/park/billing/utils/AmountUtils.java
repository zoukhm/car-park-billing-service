package com.car.park.billing.utils;


public class AmountUtils {
	public static double roundUp(double amount) {
		double floor = Math.floor(amount); 
		if(amount==floor) {
			return floor;
		} else if(amount-floor<=0.5 ) {
			return floor+0.5;
		} else {
			return floor+1;
		}
	}
}
