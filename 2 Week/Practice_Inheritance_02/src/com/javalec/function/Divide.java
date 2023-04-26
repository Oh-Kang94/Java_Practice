package com.javalec.function;

public class Divide extends Times {
	// Field

	// Constructor
	public Divide() {

	}
	// Method

	public void divides(int firstNum, int secondNum) {
		System.out.println(Integer.toString(firstNum) + " / " + Integer.toString(secondNum) + " = "
				+ Double.toString(((double)firstNum / secondNum))); 

	}
}
