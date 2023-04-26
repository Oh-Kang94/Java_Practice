package com.javalec.function;

public class Sum {
	// Fields
	int num, temp;
	int result;

	// Constructor
	public Sum() {

	}

	public Sum(int num) {
		super();
		this.num = num;
	}

	// Method
	public int sum1() {
		while (num != 0) {
			result = result + num % 10;
			num = num / 10;
		}
		
		return result;
	}

}
