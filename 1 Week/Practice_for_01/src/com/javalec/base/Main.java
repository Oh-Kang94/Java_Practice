package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		1에서 10까지를 출력
//		반복문에는 i(index)를 쓴다.
		for (int i = 1; i <= 10; i++) {
			System.out.println(">>>" + i);
		}

		for (int i = 1; i <= 9; i++) {
			System.out.println("2 X " + i + " = " + (2 * i));
		}
//		+="x"는 x만큼의 숫자를 더하기.
		for (int i = 2; i <= 8; i += 2) {
			System.out.println("2 X " + i + " = " + (2 * i));
		}
//		1부터 10까지의 합계
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i; 
			// sum = sum +i;
		}
		
		System.out.println("1~10까지의 합계 : " +sum);
		
//		범위의 합계 구하기
		
		Scanner scanner = new Scanner(System.in);
		int sum01 = 0;
		int startNum = 0;
		int endNum = 0;
		
		System.out.print("시작하는 숫자를 알려주세요 : ");
		startNum = scanner.nextInt();
		
		System.out.print("끝나는 숫자를 알려주세요 : ");
		endNum = scanner.nextInt();
		
		for (int i=startNum; i<=endNum; i++) {
			sum01 +=i;
		}
		
		System.out.println(startNum+"~"+endNum+"까지의 합계 : " +sum01);
	}
}
