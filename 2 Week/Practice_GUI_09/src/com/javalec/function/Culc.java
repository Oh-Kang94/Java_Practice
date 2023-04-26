package com.javalec.function;

public class Culc {
	//Fields
	int num1,num2,sum,temp;

	
	// Constructor
	public Culc() {
		
	}
	
	public Culc(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Method
	public int all() {
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i<=num2; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int even() {
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i<=num2; i++) {
			if(i%2 == 0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public int odd() {
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1; i<=num2; i++) {
			if(i%2 != 0) {
				sum= sum+i;
			}
		}
		return sum;
	}

}
