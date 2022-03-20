package com.calculatorapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.calculatorapp.services.ICalculatorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CalculatorappApplication {
	
	private static Logger log = LoggerFactory.getLogger(CalculatorappApplication.class);
	
	@Autowired
	private ICalculatorService calculatorService;
	
	public void addition() {
		int addition = calculatorService.addition(10, 20);
		log.info("Display Addition Result: {}", addition);
	}
	public void subtract() {
		int subtract = calculatorService.subtract(20, 10);
		log.info("Display Subtract Result: {}", subtract);
	}
	public void multiply() {
		int multiply = calculatorService.multiply(10, 20);
		log.info("Display Multiply Result: {}", multiply);
	}
	public void division() {
		int division = calculatorService.division(20, 10);
		log.info("Display Division Result: {}", division);
	}

	public static void main(String[] args) {
		log.info("!!!Start Processing!!!");
		ApplicationContext applicationContext = SpringApplication.run(CalculatorappApplication.class, args);
		CalculatorappApplication application = applicationContext.getBean(CalculatorappApplication.class);
		application.addition();
		application.subtract();
		application.multiply();
		application.division();
		log.info("!!!End Processing!!!");
	}

}
