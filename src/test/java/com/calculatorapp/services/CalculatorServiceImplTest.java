package com.calculatorapp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorServiceImplTest {
	
	@Autowired
	private ICalculatorService calculatorService;
	
	@Test
	void addition() {
		int addition = calculatorService.addition(10, 20);
		assertEquals(30, addition);
	}
	
	@Test
	void subtract() {
		int addition = calculatorService.subtract(20, 10);
		assertEquals(10, addition);
	}
	
	@Test
	void multiply() {
		int addition = calculatorService.multiply(10, 20);
		assertEquals(200, addition);
	}
	
	@Test
	void division() {
		int addition = calculatorService.division(20, 10);
		assertEquals(2, addition);
	}

}