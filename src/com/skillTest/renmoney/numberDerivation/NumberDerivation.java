package com.skillTest.renmoney.numberDerivation;


import com.skillTest.renmoney.comparator.IComparator;
import com.skillTest.renmoney.numberGenerator.INumberGenerator;

public class NumberDerivation {
	
	private INumberGenerator numberGeneratorOne;
	
	private INumberGenerator numberGeneratorTwo;
	
	private IComparator comparator;
	
	private long initialValueForGeneratorOne;
	
	private long initialValueForGeneratorTwo;
	
	private long numberOfIterations;
	
	public long numberDerivation() {
		long numberOfPositiveResult = 0;
		
		for(int index = 0; index < numberOfIterations; index++) {
			initialValueForGeneratorOne = numberGeneratorOne.generate(initialValueForGeneratorOne);
			initialValueForGeneratorTwo = numberGeneratorTwo.generate(initialValueForGeneratorTwo);

			if(comparator.compare(initialValueForGeneratorOne, initialValueForGeneratorTwo)) {
				numberOfPositiveResult++;
			}
		}
		
		return numberOfPositiveResult;
	}


	public void setNumberGeneratorOne(INumberGenerator numberGeneratorOne) {
		this.numberGeneratorOne = numberGeneratorOne;
	}

	public void setNumberGeneratorTwo(INumberGenerator numberGeneratorTwo) {
		this.numberGeneratorTwo = numberGeneratorTwo;
	}

	public void setComparator(IComparator comparator) {
		this.comparator = comparator;
	}

	public void setInitialValueForGeneratorOne(long initialValueForGeneratorOne) {
		this.initialValueForGeneratorOne = initialValueForGeneratorOne;
	}

	public void setInitialValueForGeneratorTwo(long initialValueForGeneratorTwo) {
		this.initialValueForGeneratorTwo = initialValueForGeneratorTwo;
	}

	public void setNumberOfIterations(long numberOfIterations) {
		this.numberOfIterations = numberOfIterations;
	}	
	
	
}
