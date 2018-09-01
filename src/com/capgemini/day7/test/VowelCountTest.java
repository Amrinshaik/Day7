package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.VowelCount;
class VowelCountTest {

	@Test
	void testVowelCount() {
		assertEquals(7, VowelCount.CountVowels("C:\\Amrin\\amrintext.txt"));
	}

}
