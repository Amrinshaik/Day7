package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileHandlingTest {

	@Test
	void test() {
File file =new File("C:\\Amrin\\amrintext.txt");
assertEquals(true, file.exists());
	}

}
