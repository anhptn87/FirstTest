package com.viettel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue()

	{
		int a = 1;
		int b = 2;
		int c = 3;

		System.out.println("run test");
		// assertEquals(8, a+b);
		assertEquals(3, a + b);

	}

	@Test
	public void minus() {
		System.out.println("minus");
		assertEquals(0, 2 + 2);

	}
}
