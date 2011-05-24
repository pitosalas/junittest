package com.salas.junittest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassTest {

	@Test
	public void testMultiply() {
		TestClass tester = new TestClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
}
