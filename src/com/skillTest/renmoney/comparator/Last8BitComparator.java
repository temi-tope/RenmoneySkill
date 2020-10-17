/**
 * 
 */
package com.skillTest.renmoney.comparator;


public class Last8BitComparator implements IComparator {

	/*
	 * Returns true when the last 8 bits of the parameters match
	 */
	@Override
	public boolean compare(long valueOne, long valueTwo) {	
		String valueOneBinary = decimalToBinary(valueOne);
		String valueTwoBinary = decimalToBinary(valueTwo);
		
		//System.out.println(valueOneBinary);
		//System.out.println(valueTwoBinary + "\n");
		
		int indexOfValueOneBinaryLast8Bit = Math.abs(valueOneBinary.length() - 8);
		int indexOfValueTwoBinaryLast8Bit = Math.abs(valueTwoBinary.length() - 8);
		
		String valueOneBinaryLast8Bit = valueOneBinary
												.substring(indexOfValueOneBinaryLast8Bit);
		String valueTwoBinaryLast8Bit = valueTwoBinary
												.substring(indexOfValueTwoBinaryLast8Bit);

		return valueOneBinaryLast8Bit.equals(valueTwoBinaryLast8Bit) ? true : false;
	}
	
	private static String decimalToBinary(long decimalValue) {
		return new String (Long.toBinaryString(decimalValue|0x100000000L).substring(1));
	}

}
