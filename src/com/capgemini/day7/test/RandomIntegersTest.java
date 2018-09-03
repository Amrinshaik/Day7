package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.RandomInteger;

class RandomIntegersTest {

	@Test
	void testRandomInteger() {
		File file = new File("C:\\Amrin\\aamrintext.docx");
		assertEquals(1,RandomInteger.random(file));
	}
}
