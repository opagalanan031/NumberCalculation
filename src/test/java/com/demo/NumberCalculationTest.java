package com.demo;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * @author: Oliver Pagalanan
 * @time: Mar 10, 2022-11:54:05 AM
 */
public class NumberCalculationTest {
	
	NumberCalculation numberCalculation = new NumberCalculation();
	
	// Test Case
	@Test
	public void testCase1() {
		assertEquals(numberCalculation.add(1, 2), 3);
	}
	
	// Test Case
	@Test
	public void testCase2() {
		assertEquals(numberCalculation.convertCase("hello"), "HELLO");
	}
	
	
}
