package com.javalec.function;

public class Sum {
	// field
	int num1, num2;
	int result = 0;
	int temp;

	// constructor
	public Sum() {

	}

	public Sum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	// Method

	public int sum() {
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1; i <= num2; i++) {
			result = result + i;
		}

		return result;
	}

}
