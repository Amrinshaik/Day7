package com.capgemini.day7.domain;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static boolean Date(String string) throws IOException {
	Date todaysDate = new Date();
	DateFormat df = new SimpleDateFormat();
	string=df.format(todaysDate);
	
	return true;
}
}