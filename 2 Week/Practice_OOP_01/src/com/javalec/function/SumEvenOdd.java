package com.javalec.function;

public class SumEvenOdd {
	// Field, Property = 전역 변수
	int sum = 0;

	// Constructor
	public SumEvenOdd() {
		// TODO Auto-generated constructor stub
	}

	// Method = 기능
	// 합계를 구한다.
	public int sumCalc(int startNum, int endNum) {

		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}
		return sum;
	}

	// 짝수 홀수 판단.
	public String evenOdd() {
		String result = "";
		if(sum%2==0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
	}

}
