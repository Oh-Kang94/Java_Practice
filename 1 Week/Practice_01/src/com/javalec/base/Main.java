package com.javalec.base;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sum = 0 ;
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("숫자1을 입력하세요!");
		int num1 = scanner.nextInt();
	
		System.out.println("원하는 연산을 입력하세요!\t(+,-,*,/ 중 하나)\t");
		String operator = scanner.next();
	
		System.out.println("숫자2를 입력하세요!");
		int num2 = scanner.nextInt();
	
		if (operator.equals("+") ) {
				sum = num1 + num2;
			}else if(operator.equals("-")) {
				sum = num1 - num2;
			}else if(operator.equals("*")) {
				sum = num1 * num2;
			}else if(operator.equals("/")) {
				sum = num1 / num2;
			}
	
		System.out.println(sum +"입니다.");
	
	}
	
}

