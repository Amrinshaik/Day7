package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Date7;

class Date7Test {

	@Test
	void test() throws ParseException {
		 assertEquals("11/11/2011",Date7.date1("11112011"));
		 assertEquals("11 November 2011",Date7.date2("11112011"));
	}

}
