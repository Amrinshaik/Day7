package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.Grep;

class GrepTest {

	@Test
	void test() {
		File file = new File("C:\\Amrin\\amrintext.txt");
		assertEquals(true, Grep.stringSearch(file, "amrin"));
	}

}
