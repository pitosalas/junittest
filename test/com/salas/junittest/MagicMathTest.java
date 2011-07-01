package com.salas.junittest;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.internal.runners.statements.Fail;

import static org.junit.Assert.assertEquals;

public class MagicMathTest {

	@Test
	public void testMultiply() {
		MagicMath tester = new MagicMath();
		assertEquals("Muliply 10 with 5", 50, tester.multiply(10, 5));
		
	}
	
	@Test
	public void testDivZeroExc() {
		MagicMath tester = new MagicMath();
		tester.divide(100, 0);
	}
	
	@Test
	public void testDivZero1() {
		boolean exc = false;
		try {
			MagicMath tester = new MagicMath();
			tester.divide(100, 0);
		} catch (Exception e) {
			exc = true;
		}
		if (!exc) {
			assertEquals(1,0);
		}
	}
	
}
