package com.calculatorapp.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {"com.calculatorapp.cucumber"})
public class CalculatorBDDTest {
}
