package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.LineCount;

class LineCountTest {
	
	
	@Test
	void testNoOfLines() {
		assertEquals(2, LineCount.CountLine("C:\\Amrin\\amrintext.txt"));
}
}

