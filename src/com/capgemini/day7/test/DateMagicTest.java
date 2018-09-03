package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateMagic;

class DateMagicTest {

	@Test
	void testCheckMagic() {
		assertEquals(true, DateMagic.checkMagic(4,4,16));
		assertEquals(false, DateMagic.checkMagic(4,4,18));
	}

}
