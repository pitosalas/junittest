package com.salas.junittest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MagicMathTest {

	@Test
	public void testMultiply() {
		MagicMath tester = new MagicMath();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
}
