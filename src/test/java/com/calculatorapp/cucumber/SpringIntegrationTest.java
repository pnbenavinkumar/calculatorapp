package com.calculatorapp.cucumber;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.calculatorapp.CalculatorappApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CalculatorappApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration
public abstract class SpringIntegrationTest {	
}
