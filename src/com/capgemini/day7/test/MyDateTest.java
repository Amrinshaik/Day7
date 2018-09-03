package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.MyDate;

class MyDateTest {
	
	@Test
	void test() throws IOException {
		
	assertEquals(true, MyDate.Date("EEEE, MMMM dd, yyyy"));
	
}
}