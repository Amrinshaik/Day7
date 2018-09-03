package com.capgemini.day7;

import java.io.Serializable;
import java.time.LocalDate;

public class MyDate2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private LocalDate date;
	public LocalDate getDay;

	
	public MyDate2(LocalDate date) {
		super();
		this.date = date;
	}
	public MyDate2() {
		super();
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getGetDay() {
		return getDay;
	}
	public void setGetDay(LocalDate getDay) {
		this.getDay = getDay;
	}


}
