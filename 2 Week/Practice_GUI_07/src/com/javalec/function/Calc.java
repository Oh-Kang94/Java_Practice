package com.javalec.function;

public class Calc {
	// Fields
	
	int num1,num2;
	
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
		return num1 +num2;
	}
	public int sub() {
		return num1 -num2;
	}
	public int mul() {
		return num1 *num2;
	}
	public double div() {
		return (double)num1 /num2;
	}
	
	
}
