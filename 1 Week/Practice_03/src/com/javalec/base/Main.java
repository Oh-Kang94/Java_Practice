package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num01 = 0;
		String result = ("");
		String messagePre = "입력하신 숫자 ";
		
		System.out.print("숫자를 입력하세요 : ");
		num01 = scanner.nextInt();
		
		if(num01%2 == 0) {
			result = "(은)는 짝수 입니다.";
		}else {
			result = "(은)는 홀수 입니다.";
		}
		
		System.out.println(messagePre +num01 +result);

	}

}
