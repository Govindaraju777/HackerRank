package com.tst;

import java.util.Calendar;
import java.util.Date;

public class DateCal {
	public static void main(String[] args) {
		
		Calendar c1 = Calendar.getInstance();
		
		Date d1 = new Date();
		Date d2 = new Date();
		System.out.println(d1.before(d2));
		
		d1.getMonth();
	}
}
