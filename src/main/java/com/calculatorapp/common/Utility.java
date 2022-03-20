package com.calculatorapp.common;

import java.util.Optional;

public class Utility {

	private Utility() {}
	
	public static boolean checkNullableInt(int firstNumber, int secoundNumber) {
		boolean result = false;
		if(Optional.ofNullable(firstNumber).orElse(0) != 0 && Optional.ofNullable(secoundNumber).orElse(0) != 0) {
			result = true;
		}
		return result;
	}
}
