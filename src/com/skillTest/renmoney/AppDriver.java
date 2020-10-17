package com.skillTest.renmoney;


import java.util.Scanner;

import com.skillTest.renmoney.comparator.Last8BitComparator;
import com.skillTest.renmoney.constants.Constant;
import com.skillTest.renmoney.numberDerivation.NumberDerivation;
import com.skillTest.renmoney.numberGenerator.GeneratorA;
import com.skillTest.renmoney.numberGenerator.GeneratorB;

public class AppDriver {


	public static void main(String[] args) {

		//long inputA = "65";
		//long inputB = "8921";

		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter value for generator A? ");
		long inputA = scan.nextInt();
		System.out.print("Enter value for generator B? ");
		long inputB = scan.nextInt();
		scan.close();
		
		long initialValueA = inputA;
		long initialValueB = inputB;
		
		NumberDerivation numberDerivation = new NumberDerivation();
		numberDerivation.setComparator(new Last8BitComparator());
		numberDerivation.setNumberOfIterations(Constant.NUMBER_OF_ITERATIONS);
		
		numberDerivation.setNumberGeneratorOne(new GeneratorA());
		numberDerivation.setInitialValueForGeneratorOne(initialValueA);
		
		numberDerivation.setNumberGeneratorTwo(new GeneratorB());
		numberDerivation.setInitialValueForGeneratorTwo(initialValueB);
		
		
		System.out.println("With parameters " + inputA + " and " + inputB + " the result is" + " "  + numberDerivation.numberDerivation());
		
	}

}
