package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.domain.WordCount;

class WordCountTest {
int count=0;

	@Test
	void testWordCount() {
		
		assertEquals(6, WordCount.CountWords("C:\\Amrin\\amrintext.txt"));

}
}
