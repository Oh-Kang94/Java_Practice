package com.javalec.function;

public class Calc {

	// Field
	int num1;
	int num2;

	// Constructor
	public Calc() {

	}

	public Calc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// Method
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
}
