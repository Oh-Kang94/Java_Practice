package com.javalec.base;

import java.util.Scanner;
//기본 패키지가 아닌, 다른 누군가가 만든 패키지.

public class Main {
	public static void main(String[] args) {
		//사용자로부터 num1을 입력받자!
		Scanner scanner = new Scanner(System.in);
		
		//정수형 변수 선언 
		//int는 정수. double은 실수 => Type이라는 것.
		//ln은 한줄 띄기 
		System.out.print("숫자1을 입력하세요!");
		int num1 = scanner.nextInt();
		
		System.out.print("숫자2를 입력하세요!");
		int num2 = scanner.nextInt();
		// "=" 할당한다. (assign)
		// "+" 문자를 연결한다. 
		
		// 출력 d
		System.out.println(num1+num2);
		
		// 덧셈 출력 
		System.out.println(num1 +" + " +num2 +" = " +(num1+num2));
		
		// 뺄셈  출력 
		System.out.println(num1 +" - " +num2 +" = " +(num1-num2));
		
		// 곱셈  출력 
		System.out.println(num1 +" x " +num2 +" = " +(num1*num2));
		
		// 나누기  출력 
		System.out.println(num1 +" / " +num2 +" = " +((double)num1/num2));
		
	}
} 