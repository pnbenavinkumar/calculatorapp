package com.calculatorapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorDaoImpl implements ICalculatorDao {

	@Override
	public int addition(int result) {
		return result;
	}

	@Override
	public int subtract(int result) {
		return result;
	}

	@Override
	public int multiply(int result) {
		return result;
	}

	@Override
	public int division(int result) {
		return result;
	}

}
