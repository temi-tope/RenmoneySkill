package com.skillTest.renmoney.numberGenerator;



import com.skillTest.renmoney.constants.Constant;

public class GeneratorA implements INumberGenerator{

	
	@Override
	public long generate(long initialValue) {
		long result = (initialValue * Constant.FACTOR_A) % Constant.COMMON_DIVISOR;
		return result;
	}
	
}
