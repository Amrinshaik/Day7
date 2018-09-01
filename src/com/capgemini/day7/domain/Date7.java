package com.capgemini.day7.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date7 {

	public static String date1(String string1) throws ParseException {
		
		Date dateFormat1 = new SimpleDateFormat("ddMMyyyy").parse(string1);
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		String strDate = format.format(dateFormat1);
		System.out.println("Date Format with MM/dd/yyyy : " + strDate);
		return strDate;
		
	}

	public static String date2(String string2) throws ParseException {
		Date dateFormat2 = new SimpleDateFormat("ddMMyyyy").parse(string2);
		SimpleDateFormat format = new SimpleDateFormat("dd MMMM YYYY");
		String strDate = format.format(dateFormat2);
		System.out.println("Date Format with dd MMMM YYYY : " + strDate);
		return strDate;
	}

}
