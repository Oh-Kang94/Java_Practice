package com.javalec.function;

public class Sub extends Add{

	// Constructor
	public Sub() {

	}

	// Method

	public void sub(int firstNum, int secondNum) {
	System.out.println(Integer.toString(firstNum) + " - " + Integer.toString(secondNum) + " = "
			+ Integer.toString((firstNum - secondNum))); 
	}
}
