/**
 * 
 */
package com.salas.junit.example;

/**
 * @author pitosalas
 *
 */
public class BasicTest {
	public void testEmptyBuffer() {
		StringBuffer buf = new StringBuffer();
		assertTrue(buf.toString().equals(""));
		assertTrue(buf.length()== 0);
		
	}
}
