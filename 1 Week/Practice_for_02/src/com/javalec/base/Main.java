package com.javalec.base;

public class Main {

	public static void main(String[] args) {
//		1부터 100까지의 홀수와 짝수 합계 구하기

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("1부터 100까지의 짝수의 합은 " + evenSum + "입니다.");
		System.out.println("1부터 100까지의 홀수의 합은 " + oddSum + "입니다.");

		// 3의 배수이거나 5의 배수의 합.

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}

		System.out.println("1부터 100까지의 3의 배수이거나 5의 배수의 합은 " +sum + "입니다.");

	}

}
