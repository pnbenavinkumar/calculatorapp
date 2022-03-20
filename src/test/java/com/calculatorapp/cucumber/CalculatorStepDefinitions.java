package com.calculatorapp.cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;

import com.calculatorapp.services.ICalculatorService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefinitions extends SpringIntegrationTest {
	
	int actual = 0;
	
	@Autowired
	private ICalculatorService calculatorService;
	
	@Given("Create two numbers for addition")
	public void create_two_numbers_for_addition() {
	}
	
	@When("^the user call addition with value \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_calls_arithmetic_addition_with_values_and(int firstNumber, int secondNumber) {
		actual = calculatorService.addition(firstNumber, secondNumber);
	}
	
	@Then("The output of addition is {int}")
	public void the_output_of_addition_is(Integer expected) {
		assertEquals(expected, actual);
	}
	
	@Given("Create two numbers for subtraction")
	public void create_two_numbers_for_subtraction() {
	}
	
	@When("^the user call subtract with value \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_calls_arithmetic_subtract_with_values_and(int firstNumber, int secondNumber) {
		actual = calculatorService.subtract(firstNumber, secondNumber);
	}
	
	@Then("The output of subtract is {int}")
	public void the_output_of_subtract_is(Integer expected) {
		assertEquals(expected, actual);
	}
	
	@Given("Create two numbers for Multiplication")
	public void create_two_numbers_for_Multiplication() {
	}
	
	@When("^the user call multiply with value \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_calls_arithmetic_multiply_with_values_and(int firstNumber, int secondNumber) {
		actual = calculatorService.multiply(firstNumber, secondNumber);
	}
	
	@Then("The output of multiply is {int}")
	public void the_output_of_multiply_is(Integer expected) {
		assertEquals(expected, actual);
	}
	
	@Given("Create two numbers for division")
	public void create_two_numbers_for_division() {
	}
	
	@When("^the user call division with value \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_calls_arithmetic_division_with_values_and(int firstNumber, int secondNumber) {
		actual = calculatorService.division(firstNumber, secondNumber);
	}
	
	@Then("The output of division is {int}")
	public void the_output_of_division_is(Integer expected) {
		assertEquals(expected, actual);
	}
}