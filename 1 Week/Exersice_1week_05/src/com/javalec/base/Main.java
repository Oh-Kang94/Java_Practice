// 정수의 각자리수의 합을 구하시오.
// 결과문 : 
//  Enter an integer(0~9) : 214421
//  Sum of digits = 14

package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputValue = 0, calcValue = 0, sum = 0;

		System.out.print("Enter an integer(0~9) : ");
		inputValue = scanner.nextInt();

		while (true) {
			if (inputValue % 10 != 0) {
				calcValue = inputValue % 10;
				inputValue = inputValue / 10;
				sum = sum + calcValue;
			} else {
				break;
			}
		}
// 		while 문 쓰기.
		while (inputValue % 10 != 0) {
			calcValue = inputValue % 10;
			inputValue = inputValue / 10;
			sum = sum + calcValue;
		}

		System.out.println("Sum of digits = " + sum);

	}

}