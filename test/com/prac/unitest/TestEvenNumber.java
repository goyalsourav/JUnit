package com.prac.unitest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEvenNumber {

	@Test
	public void successEvenNumber() {
		boolean result = EvenNumber.checkNumIsEven(40);
		assertEquals(true, result);
	}
	
	@Test
	public void successOddNumber() {
		boolean result = EvenNumber.checkNumIsEven(45);
		assertEquals(false, result);
	}
	
	@Test
	public void negativeNumber() {
		boolean result = EvenNumber.checkNumIsEven(-4);
		assertEquals(false, result);
	}

}
