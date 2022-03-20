package com.calculatorapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculatorapp.common.Utility;
import com.calculatorapp.repository.ICalculatorDao;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

	@Autowired
	private ICalculatorDao iCalculatorDao;
	
	@Override
	public int addition(int firstNumber, int secoundNumber) {
		int result = 0;
		if(Utility.checkNullableInt(firstNumber, secoundNumber)) {
			result = firstNumber + secoundNumber;
		}
		return iCalculatorDao.addition(result);
	}

	@Override
	public int subtract(int firstNumber, int secoundNumber) {
		int result = 0;
		if(Utility.checkNullableInt(firstNumber, secoundNumber)) {
			result = firstNumber - secoundNumber;
		}
		return iCalculatorDao.addition(result);
	}

	@Override
	public int multiply(int firstNumber, int secoundNumber) {
		int result = 0;
		if(Utility.checkNullableInt(firstNumber, secoundNumber)) {
			result = firstNumber * secoundNumber;
		}
		return iCalculatorDao.addition(result);
	}

	@Override
	public int division(int firstNumber, int secoundNumber) {
		int result = 0;
		if(Utility.checkNullableInt(firstNumber, secoundNumber)) {
			result = firstNumber / secoundNumber;
		}
		return iCalculatorDao.addition(result);
	}

}
