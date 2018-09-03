package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.Date10;
class Date10Test {

	@Test
	void testDate10() {
		assertEquals(false, Date10.date("29/02/2011",2));
		assertEquals(true, Date10.date("29/01/2012",2));
		assertEquals(true, Date10.date("20/01/2015",2));
	}

}
