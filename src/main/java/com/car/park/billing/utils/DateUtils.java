package com.car.park.billing.utils;

import java.util.Date;

public class DateUtils {

	public static String formatMinutes(int minutes) {
		int hours = minutes/60;
		int min = minutes-hours*60;
		return hours+"h"+(min<10?"0":"")+min;
	}
	
	
	public static int calculateMinutesBetweenTwoDates(Date d1, Date d2) {
		long duration = d2.getTime() - d1.getTime();
		return (int) (duration/(1000*60));
	}
}
